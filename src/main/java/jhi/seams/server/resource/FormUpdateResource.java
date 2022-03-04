package jhi.seams.server.resource;

import jhi.seams.server.util.DatabaseUpdater;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.logging.Logger;

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
