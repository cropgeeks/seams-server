package jhi.seams.pojo;

import jhi.seams.server.database.codegen.tables.pojos.*;

import java.util.List;

public class ComponentData
{
	private Components                      component;
	private List<ViewMeasurementComponents> data;

	public ComponentData()
	{
	}

	public ComponentData(Components component, List<ViewMeasurementComponents> data)
	{
		this.component = component;
		this.data = data;
	}

	public Components getComponent()
	{
		return component;
	}

	public ComponentData setComponent(Components component)
	{
		this.component = component;
		return this;
	}

	public List<ViewMeasurementComponents> getData()
	{
		return data;
	}

	public ComponentData setData(List<ViewMeasurementComponents> data)
	{
		this.data = data;
		return this;
	}
}
