package playerCommands;

import playerResources.CommandActions;

public class GenericCommand {

	String name;
	String altName;
	CommandActions commandActions;
	String commandDescription;

	public GenericCommand(String name, String altName, CommandActions commandActions, String commandDescription) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.altName = altName;
		this.commandActions = commandActions;
		this.commandDescription = commandDescription;
	}

	public String getName() {
		return name;
	}

	public String getAltName() {
		return altName;
	}
	
	public boolean checkIfEqualToName(String possibleName) {
		if (altName.equals("")) {
			if (name.equals(possibleName)) {
				return true;
			} else {
				return false;
			}
		} else {
			if (name.equals(possibleName) || altName.equals(possibleName)) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	public void useCommand()
	{
		System.out.println(commandDescription);
		commandActions.activateCommandActions();
	}
}
