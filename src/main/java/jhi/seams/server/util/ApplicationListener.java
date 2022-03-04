package jhi.seams.server.util;

import com.thetransactioncompany.cors.*;
import jhi.seams.server.Database;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import java.util.Properties;
import java.util.concurrent.*;

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
	private static ScheduledExecutorService backgroundScheduler;

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

		backgroundScheduler = Executors.newSingleThreadScheduledExecutor();
		// Run the importer at least once a day. It will also be triggered by form submissions
		backgroundScheduler.scheduleAtFixedRate(new DatabaseUpdaterRunnable(), 1, 1440, TimeUnit.MINUTES);

		PropertyWatcher.initialize();
	}

	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent)
	{
		PropertyWatcher.stopFileWatcher();

		try
		{
			// Stop the scheduler
			if (backgroundScheduler != null)
				backgroundScheduler.shutdownNow();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		Database.close();
	}
}
