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
		
		List<Integer> resourceChange2 = new ArrayList<Integer>();
		resourceChange2.add(-banana.getResourceQuantity());
		
		List<GenericCommand> possibleActions = new ArrayList<GenericCommand>();
		possibleActions.add(new GenericCommand("talk", "communicate", new CommandActions(resources, resourceChange), "You talk to the gorilla and he gives you some bananas."));
		possibleActions.add(new GenericCommand("attack", "fight", new CommandActions(resources, resourceChange2), "You fight the gorrila and lose, because he is a gorilla. He take all of your bananas, because again he is a gorilla."));
		GenericSituation situation = new GenericSituation("You run into a gorrila", possibleActions);
		System.out.println(situation.startSituation());
	}
}