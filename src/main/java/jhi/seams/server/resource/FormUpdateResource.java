package jhi.seams.server.resource;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jhi.seams.server.util.DatabaseUpdater;

@Path("form-update")
public class FormUpdateResource
{
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void getFormUpdate()
	{
		// Fire off the spreadsheet importer
		new Thread(DatabaseUpdater::fromSpreadsheet).start();
	}
}
