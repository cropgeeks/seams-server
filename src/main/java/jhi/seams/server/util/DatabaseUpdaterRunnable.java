package jhi.seams.server.util;

public class DatabaseUpdaterRunnable implements Runnable
{
	@Override
	public void run()
	{
		DatabaseUpdater.fromSpreadsheet();
	}
}
