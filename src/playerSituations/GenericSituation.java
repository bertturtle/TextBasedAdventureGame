package playerSituations;

import java.util.List;
import java.util.Scanner;

import playerCommands.GenericCommand;

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
		return null;
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
				System.out.println("That is not a valid command");
				command = scanner.next();
				commandUsed = checkCommand(command);
			}
			commandUsed.useCommand();
		}
	}
}
