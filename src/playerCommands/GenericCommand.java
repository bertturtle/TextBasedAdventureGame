package playerCommands;

public class GenericCommand {

	String name;
	String altName;

	public GenericCommand(String name, String altName) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.altName = altName;
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
}
