package playerController;

import java.awt.BorderLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import playerCommands.GenericCommand;
import playerResources.CommandActions;
import playerResources.GenericResource;
import playerSituations.GenericSituation;
import popupController.ImprovedJFrame;

public class Main {
	
	static GenericResource banana;
	public static int buttonPressed = 0;
	public static List<GenericResource> resourceList = new ArrayList<GenericResource>();
	
	public static void main(String[] args) {
		String title = "Adventure of a Lifetime";
		
		ImprovedJFrame adventureDialog = new ImprovedJFrame(title, "You run into a gorilla", "Let's fight the gorilla", "Talk to the gorilla", "Give him one of your delicious bananas");
		
		while(buttonPressed == 0)
		{
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (buttonPressed == 1) 
		{
			adventureDialog.setText(title, "This doth be a test", "Button one", "Second Button", "");
			while(buttonPressed == 0)
			{
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if (buttonPressed == 1)
			{
				adventureDialog.gameEnd("It is over");
			}
			else if (buttonPressed == 2)
			{
				adventureDialog.setText(title, "Further Testing there be", "Button one text", "Second Button Text", "Another Button Text");
			}
		}
		else if (buttonPressed == 2)
		{
			adventureDialog.gameEnd("You Ded");
		}
		else if (buttonPressed == 3)
		{
			adventureDialog.gameEnd("GG Scrub");
		}
		
//		banana = new GenericResource("Banana", 5, "");
//		
//		List<GenericResource> resources = new ArrayList<GenericResource>();
//		resources.add(banana);
//		
//		List<Integer> resourceChange = new ArrayList<Integer>();
//		resourceChange.add(3);
//		
//		List<Integer> resourceChange2 = new ArrayList<Integer>();
//		resourceChange2.add(-banana.getResourceQuantity());
//		
//		List<GenericCommand> possibleActions = new ArrayList<GenericCommand>();
//		possibleActions.add(new GenericCommand("talk", "communicate", new CommandActions(resources, resourceChange), "You talk to the gorilla and he gives you some bananas."));
//		possibleActions.add(new GenericCommand("attack", "fight", new CommandActions(resources, resourceChange2), "You fight the gorrila and lose, because he is a gorilla. He take all of your bananas, because again he is a gorilla."));
//		GenericSituation situation = new GenericSituation("You run into a gorrila", possibleActions);
//		System.out.println(situation.startSituation());
	}
}