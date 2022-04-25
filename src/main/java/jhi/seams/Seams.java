package jhi.seams;

import org.glassfish.jersey.server.ResourceConfig;

import jakarta.ws.rs.ApplicationPath;

@ApplicationPath("/api/")
public class Seams extends ResourceConfig
{
	public Seams()
	{
		packages("jhi.seams.server");
	}
}
