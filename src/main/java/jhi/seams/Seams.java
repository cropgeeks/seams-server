package jhi.seams;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/api/")
public class Seams extends ResourceConfig
{
	public Seams()
	{
		packages("jhi.seams.server");
	}
}
