package jhi.seams.server.resource;

import jhi.seams.pojo.ViewDatasetMetaComponents;
import jhi.seams.server.Database;
import jhi.seams.server.database.codegen.tables.pojos.*;
import jhi.seams.server.util.CollectionUtils;
import org.jooq.DSLContext;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.sql.*;
import java.util.*;
import java.util.stream.Collectors;

import static jhi.seams.server.database.codegen.tables.Components.*;
import static jhi.seams.server.database.codegen.tables.ViewDatasetMeta.*;
import static jhi.seams.server.database.codegen.tables.ViewMeasurementComponents.*;

@Path("dataset")
public class DatasetLERResource
{
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
				d.setComponents(CollectionUtils.isEmptyOrNull(d.getComponentIds()) ? null : Arrays.stream(d.getComponentIds()).map(components::get).collect(Collectors.toList()));
				d.setData(context.selectFrom(VIEW_MEASUREMENT_COMPONENTS)
								 .where(VIEW_MEASUREMENT_COMPONENTS.DATASET_ID.eq(d.getDatasetId()))
								 .fetchInto(ViewMeasurementComponents.class));
			});

			return datasets;
		}
	}
}
