package jhi.seams.server.resource;

import com.google.gson.Gson;
import jhi.seams.server.util.StringUtils;
import org.jooq.*;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class ResourceUtils
{
	public static final String CRLF = "\r\n";

	/**
	 * Exports the given database result into the writer using the given parameters
	 *
	 * @param bw             The {@link Writer} to export to
	 * @param results        The {@link Result} containing the data
	 * @param includeHeaders Should the column headers of the database result be included?
	 * @param fieldsToIgnore Array containing the fields to ignore from the data. They will not appear in the output.
	 * @throws IOException Thrown if any IO operation fails
	 */
	public static void exportToFileStreamed(Writer bw, Cursor<? extends Record> results, boolean includeHeaders, Field<?>[] fieldsToIgnore)
		throws IOException
	{
		List<String> columnsToIgnore = fieldsToIgnore == null ? new ArrayList<>() : Arrays.stream(fieldsToIgnore).map(Field::getName).collect(Collectors.toList());
		List<String> columnsToInclude = Arrays.stream(results.fields())
											  .map(Field::getName)
											  .filter(name -> !columnsToIgnore.contains(name))
											  .collect(Collectors.toList());

		if (includeHeaders)
			bw.write(columnsToInclude.stream().collect(Collectors.joining("\t", "", CRLF)));

		while (results.hasNext())
		{
			Record r = results.fetchNext();

			if (r == null)
				continue;

			Gson gson = new Gson();

			try
			{
				bw.write(columnsToInclude.stream()
										 .map(name -> {
											 Object value = r.getValue(name);
											 if (value == null)
												 return "";
											 else
											 {
												 if (value.getClass().isArray())
													 return gson.toJson(value);
												 else
													 return value.toString();
											 }
										 })
										 .collect(Collectors.joining("\t", "", CRLF)));
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	public static File createTempFile(String parentFolder, String filename, String extension, boolean create)
		throws IOException
	{
		extension = extension.replace(".", "");

		// Use the database name here as it's going to be unique per instance and usually path-safe
		File folder = new File(System.getProperty("java.io.tmpdir"), "seams");
		folder.mkdirs();

		if (!StringUtils.isEmpty(parentFolder))
		{
			folder = new File(folder, parentFolder);
			folder.mkdirs();
		}

		File file;
		do
		{
			file = new File(folder, filename + "-" + UUID.randomUUID() + "." + extension);
		} while (file.exists());

		if (create)
			file.createNewFile();

		return file;
	}
}
