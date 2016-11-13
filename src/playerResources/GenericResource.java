package playerResources;

public class GenericResource {
	
	String name;
	int quantity;
	String unitOfMeasurement;
	
	public GenericResource(String name, int startingQuantity, String unitOfMeasurment) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.quantity = startingQuantity;
		this.unitOfMeasurement = unitOfMeasurment;
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
			return quantity + " " + unitOfMeasurement + " of " + name + ".";
		}
	}
}
