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
			if (changeInResources.get(i) < 0)
			{
				System.out.println("You lost " + resources.get(i).getCustomResourceDescription(Math.abs(changeInResources.get(i))) + " You now have " + resources.get(i).getResourceDescription());
			}
			else
			{
				System.out.println("You gained " + resources.get(i).getCustomResourceDescription(changeInResources.get(i)) + " You now have " + resources.get(i).getResourceDescription());
			}
		}
	}
}
