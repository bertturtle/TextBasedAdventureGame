package playerSituations;

import java.util.List;

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
}
