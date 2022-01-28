package jhi.seams.pojo;

import jhi.seams.server.database.codegen.tables.pojos.ViewDatasetMeta;

import java.util.*;

public class ViewDatasetMetaComponents extends ViewDatasetMeta
{
	private List<ComponentData> componentData;

	public List<ComponentData> getComponentData()
	{
		return componentData;
	}

	public ViewDatasetMetaComponents setComponentData(List<ComponentData> componentData)
	{
		this.componentData = componentData;
		return this;
	}

	public ViewDatasetMetaComponents addComponentData(ComponentData data) {
		if (componentData == null)
			componentData = new ArrayList<>();

		componentData.add(data);

		return this;
	}
}
