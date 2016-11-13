package playerController;

import java.util.ArrayList;
import java.util.List;

import playerCommands.GenericCommand;
import playerResources.CommandActions;
import playerResources.GenericResource;
import playerSituations.GenericSituation;

public class Main {
	
	static GenericResource banana;
	public static List<GenericResource> resourceList = new ArrayList<GenericResource>();
	
	public static void main(String[] args) {
		banana = new GenericResource("Banana", 5, "");
		
		List<GenericResource> resources = new ArrayList<GenericResource>();
		resources.add(banana);
		
		List<Integer> resourceChange = new ArrayList<Integer>();
		resourceChange.add(3);
		
		List<GenericCommand> possibleActions = new ArrayList<GenericCommand>();
		possibleActions.add(new GenericCommand("talk to gorrila", "talk", new CommandActions(resources, resourceChange), "You talk to the gorilla and he gives you some bananas."));
		GenericSituation situation = new GenericSituation("You run into a gorrila", possibleActions);
		System.out.println(situation.startSituation());
	}
}