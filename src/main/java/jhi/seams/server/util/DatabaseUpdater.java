package jhi.seams.server.util;

import jhi.seams.server.importer.DataImporter;

import java.io.*;
import java.net.URL;
import java.nio.file.*;
import java.sql.SQLException;
import java.util.logging.Logger;

public class DatabaseUpdater
{
	public static synchronized void fromSpreadsheet()
	{
		String url = PropertyWatcher.get(PropertyWatcher.PROP_REMOTE_SPREADSHEET_URL);

		if (StringUtils.isEmpty(url))
		{
			Logger.getLogger("").severe("LOAD REMOTE SPREADSHEET: Property not set!");
		}
		else
		{
			try
			{
				InputStream in = new URL(url).openStream();
				Path target = Files.createTempFile("seams", ".xlsx");
				Files.copy(in, target, StandardCopyOption.REPLACE_EXISTING);

				Logger.getLogger("").info("LOAD REMOTE SPREADSHEET: Successful! " + target.toFile().getAbsolutePath());

				DataImporter.importFile(target.toFile());

				target.toFile().delete();
			}
			catch (IOException | SQLException e)
			{
				e.printStackTrace();
				Logger.getLogger("").severe(e.getMessage());
			}
		}
	}
}
