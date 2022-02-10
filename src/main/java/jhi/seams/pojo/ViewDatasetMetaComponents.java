package jhi.seams.pojo;

import jhi.seams.server.database.codegen.tables.pojos.*;

import java.util.List;

public class ViewDatasetMetaComponents extends ViewDatasetMeta
{
	private List<Components>                components;
	private List<ViewMeasurementComponents> data;

	public List<Components> getComponents()
	{
		return components;
	}

	public ViewDatasetMetaComponents setComponents(List<Components> components)
	{
		this.components = components;
		return this;
	}

	public List<ViewMeasurementComponents> getData()
	{
		return data;
	}

	public ViewDatasetMetaComponents setData(List<ViewMeasurementComponents> data)
	{
		this.data = data;
		return this;
	}
}
