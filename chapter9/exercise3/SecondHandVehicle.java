package exercise3;

public class SecondHandVehicle extends Vehicle {
	private int numberOfOwners;
	
	public SecondHandVehicle(String regNo, String make, int yearOfManufacture, double value, int numberOfOwners)
	{
		super(regNo, make, yearOfManufacture, value);
		this.numberOfOwners = numberOfOwners;
	}
	
	public int getNumberOfOwners()
	{
		return this.numberOfOwners;
	}
	
	public boolean hasMultipleOwners()
	{
		if (this.numberOfOwners > 1)
			return true;
		return false;
	}
}
