package playerSituations;

import java.util.List;
import java.util.Scanner;

import playerCommands.GenericCommand;
import playerController.Main;

public class GenericSituation {
	
	String description;
	List<GenericCommand> possibleCommands;
	
	public GenericSituation(String description, List<GenericCommand> possibleCommands) {
		// TODO Auto-generated constructor stub
		this.description = description;
		this.possibleCommands = possibleCommands;
		
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public GenericCommand checkCommand(String command)
	{
		for (int i = 0; i < possibleCommands.size(); i++)
		{
			if (possibleCommands.get(i).checkIfEqualToName(command))
			{
				return possibleCommands.get(i);
			}
		}
		if (command.equals("help"))
		{
			System.out.println("You can" + getCommandList());
		}
		else if (command.equals("resources"))
		{
			System.out.println("You Have:");
			for(int i = 0; i < Main.resourceList.size(); i++)
			{
				System.out.println(Main.resourceList.get(i).getResourceDescription());
			}
		}
		return null;
	}
	
	public String getCommandList()
	{
		String commandList = "";
		for (int i = 0; i < possibleCommands.size(); i++)
		{
			if (i == possibleCommands.size() - 1 && possibleCommands.size() != 1)
			{
				commandList += ", or " + possibleCommands.get(i).getName();
			}
			else
			{
				commandList += ", " + possibleCommands.get(i).getName();
			}
		}
		return commandList;
	}
	
	public void startSituation()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println(description);
		String command = scanner.next();
		GenericCommand commandUsed = checkCommand(command);
		if (commandUsed != null)
		{
			commandUsed.useCommand();
			return;
		}
		else
		{
			while (commandUsed == null)
			{
				if (!command.equals("help") && !command.equals("resources"))
				{
					System.out.println("That is not a valid command");
				}
				command = scanner.next();
				commandUsed = checkCommand(command);
			}
			commandUsed.useCommand();
		}
	}
}
