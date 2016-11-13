package playerResources;

import java.util.List;

public class CommandActions {
	
	List<GenericResource> resources;
	List<Integer> changeInResources;
	
	public CommandActions(List<GenericResource> resources, List<Integer> changeInResources) {
		this.resources = resources;
		this.changeInResources = changeInResources;
	}
	
	public void activateCommandActions()
	{
		for (int i = 0; i < resources.size(); i++)
		{
			resources.get(i).changeResourceQuantity(changeInResources.get(i));
			System.out.println("You now have " + resources.get(i).getResourceDescription());
		}
	}
}
