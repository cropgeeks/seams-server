package jhi.seams.server.resource;

import jhi.seams.pojo.*;
import jhi.seams.server.Database;
import jhi.seams.server.database.codegen.tables.pojos.*;
import org.apache.commons.collections4.CollectionUtils;
import org.jooq.DSLContext;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.sql.*;
import java.util.*;
import java.util.stream.Collectors;

import static jhi.seams.server.database.codegen.tables.Components.*;
import static jhi.seams.server.database.codegen.tables.ViewDatasetMeta.*;
import static jhi.seams.server.database.codegen.tables.ViewMeasurementComponents.*;

@Path("dataset/ler")
public class DatasetLERResource
{
	public static void main(String[] args)
		throws SQLException
	{
		Database.init("localhost", "seams", null, "root", null, false);

		DatasetLERResource resource = new DatasetLERResource();
		resource.getDatasetLER();
	}

	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<ViewDatasetMetaComponents> getDatasetLER()
		throws SQLException
	{
		try (Connection conn = Database.getConnection())
		{
			DSLContext context = Database.getContext(conn);
			List<ViewDatasetMetaComponents> datasets = context.selectFrom(VIEW_DATASET_META)
															  .fetchInto(ViewDatasetMetaComponents.class);

			// Get a mapping of component id to pojo
			Map<Integer, Components> components = context.selectFrom(COMPONENTS)
														 .fetchMap(COMPONENTS.ID, Components.class);

			datasets.forEach(d -> {
				// For each dataset get the mapping between component id and measurements
				Map<Integer, List<ViewMeasurementComponents>> measurements = context.selectFrom(VIEW_MEASUREMENT_COMPONENTS)
																					.where(VIEW_MEASUREMENT_COMPONENTS.DATASET_ID.eq(d.getDatasetId()))
																					.fetchGroups(VIEW_MEASUREMENT_COMPONENTS.COMPONENT_ID, ViewMeasurementComponents.class);

				List<Components> c = d.getComponentIds() != null ? Arrays.stream(d.getComponentIds()).map(components::get).collect(Collectors.toList()) : null;

				if (!CollectionUtils.isEmpty(c))
				{
					// For each of the components
					c.forEach(comp -> {
						// Get the measurements
						List<ViewMeasurementComponents> data = measurements.get(comp.getId());

						// And add them to the dataset
						if (!CollectionUtils.isEmpty(data))
							d.addComponentData(new ComponentData(comp, data));
					});
				}
			});

			return datasets;
		}
	}
}
