package jhi.seams.server.resource;

import jhi.seams.pojo.ViewDatasetMetaComponents;
import jhi.seams.server.Database;
import jhi.seams.server.database.codegen.tables.pojos.*;
import jhi.seams.server.util.*;
import org.jooq.DSLContext;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.sql.*;
import java.util.Date;
import java.util.*;
import java.util.stream.Collectors;

import static jhi.seams.server.database.codegen.tables.Components.*;
import static jhi.seams.server.database.codegen.tables.ViewDatasetData.*;
import static jhi.seams.server.database.codegen.tables.ViewDatasetMeta.*;
import static jhi.seams.server.database.codegen.tables.ViewMeasurementComponents.*;

@Path("dataset")
public class DatasetResource
{
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<ViewDatasetMetaComponents> getDatasets()
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

	@Path("/data")
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Response getDatasetData()
		throws SQLException, IOException
	{
		File resultFile = ResourceUtils.createTempFile(null, "seams-" + DateTimeUtils.getFormattedDateTime(new Date()), ".txt", false);

		try (Connection conn = Database.getConnection();
			 PrintWriter bw = new PrintWriter(Files.newBufferedWriter(resultFile.toPath(), StandardCharsets.UTF_8)))
		{
			DSLContext context = Database.getContext(conn);

			ResourceUtils.exportToFileStreamed(bw, context.selectFrom(VIEW_DATASET_DATA).fetchLazy(), true, null);
		}

		java.nio.file.Path zipFilePath = resultFile.toPath();
		return Response.ok((StreamingOutput) output -> {
						   Files.copy(zipFilePath, output);
						   Files.deleteIfExists(zipFilePath);
					   })
					   .type(MediaType.TEXT_PLAIN)
					   .header("content-disposition", "attachment;filename= \"" + resultFile.getName() + "\"")
					   .header("content-length", resultFile.length())
					   .build();
	}
}
