package jhi.seams.server.resource;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import jhi.seams.server.util.*;
import jhi.seams.server.util.perdix.*;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.util.*;

@Path("camera")
public class PerdixResource extends ContextResource
{
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<PerdixClientResponse.Camera> getCameras()
	{
		return PerdixClient.getCameras();
	}

	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({"image/png", "image/jpeg", "image/svg+xml", "image/*"})
	@Path("/{cameraId}/img/{name}")
	public Response getImage(@PathParam("cameraId") String cameraId, @PathParam("name") String filename)
		throws IOException
	{
		if (cameraId == null || StringUtils.isEmpty(filename) || !Objects.equals(filename.replaceAll("[^0-9]", ""), cameraId.replaceAll("[^0-9]", ""))) {
			resp.sendError(Response.Status.BAD_REQUEST.getStatusCode());
			return null;
		}

		File perdixFolder = new File(new File(PropertyWatcher.get(PropertyWatcher.PROP_EXT_DATA)), "perdix");
		File imageFile = new File(perdixFolder, filename);

		if (!FileUtils.isSubDirectory(perdixFolder, imageFile))
		{
			resp.sendError(Response.Status.FORBIDDEN.getStatusCode());
			return null;
		}

		String extension = filename.substring(filename.lastIndexOf(".") + 1, filename.length() - 1).toLowerCase();

		String mediaType;

		switch (extension)
		{
			case "jpg":
			case "jpeg":
				mediaType = "image/jpeg";
				break;
			case "png":
				mediaType = "image/png";
				break;
			case "svg":
				mediaType = "image/svg+xml";
				break;
			default:
				mediaType = "image/*";
		}

		try
		{
			byte[] bytes = IOUtils.toByteArray(imageFile.toURI());

			return Response.ok(new ByteArrayInputStream(bytes))
						   .header("Content-Type", mediaType)
						   .build();
		}
		catch (IOException e)
		{
			e.printStackTrace();

			resp.sendError(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
			return null;
		}
	}
}
