package jhi.seams.server.util;

import com.thetransactioncompany.cors.*;
import jhi.seams.server.Database;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import java.util.Properties;

/**
 * The {@link ApplicationListener} is the main {@link ServletContextListener} of the application. It's started when the application is loaded by
 * Tomcat. It contains {@link #contextInitialized(ServletContextEvent)} which is executed on start and {@link #contextDestroyed(ServletContextEvent)}
 * which is executed when the application terminates.
 *
 * @author Sebastian Raubach
 */
@WebListener
public class ApplicationListener implements ServletContextListener
{
	@Override
	public void contextInitialized(ServletContextEvent sce)
	{
		try
		{
			Properties props = new Properties();
			props.setProperty("cors.supportedMethods", "GET, POST, HEAD, OPTIONS, PATCH, DELETE, PUT");
			final FilterRegistration.Dynamic corsFilter = sce.getServletContext().addFilter("CORS", new CORSFilter(new CORSConfiguration(props)));
			corsFilter.setInitParameter("cors.supportedMethods", "GET, POST, HEAD, OPTIONS, PATCH, DELETE, PUT");
			corsFilter.addMappingForUrlPatterns(null, false, "/*");
		}
		catch (CORSConfigurationException e)
		{
			e.printStackTrace();
		}

		PropertyWatcher.initialize();
	}

	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent)
	{
		PropertyWatcher.stopFileWatcher();

		Database.close();
	}
}
