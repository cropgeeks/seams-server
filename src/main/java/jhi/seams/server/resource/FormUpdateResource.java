package jhi.seams.server.resource;

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
		Logger.getLogger("").info("FORM SUBMITTED");
	}
}
