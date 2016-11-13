package playerResources;

import playerController.Main;

public class GenericResource {
	
	String name;
	int quantity;
	String unitOfMeasurement;
	
	public GenericResource(String name, int startingQuantity, String unitOfMeasurment) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.quantity = startingQuantity;
		this.unitOfMeasurement = unitOfMeasurment;
		Main.resourceList.add(this);
	}
	
	public int getResourceQuantity()
	{
		return quantity;
	}
	
	public void changeResourceQuantity(int changeOfQuantity)
	{
		quantity += changeOfQuantity;
	}
	
	public void setResourceQuantity(int newQuantity)
	{
		quantity = newQuantity;
	}
	
	public String getResourceName()
	{
		return name;
	}
	
	public void setResourceName(String newName)
	{
		name = newName;
	}
	
	public String getResourceDescription()
	{
		if (unitOfMeasurement.equals(""))
		{
			if (quantity == 1)
			{
				return quantity + " " + name + ".";
			}
			else
			{
				return quantity + " " + name + "s.";
			}
		}
		else
		{
			return quantity + " " + unitOfMeasurement + " of " + name + "s.";
		}
	}
	
	public String getCustomResourceDescription(int value)
	{
		if (unitOfMeasurement.equals(""))
		{
			if (value == 1)
			{
				return value + " " + name + ".";
			}
			else
			{
				return value + " " + name + "s.";
			}
		}
		else
		{
			return value + " " + unitOfMeasurement + " of " + name + "s.";
		}
	}
}
