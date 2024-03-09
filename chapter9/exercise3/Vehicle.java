package exercise3;

public class Vehicle {
	private String regNo;
	private String make;
	private int yearOfManufacture;
	private double value;
	
	public Vehicle(String regNo, String make, int yearOfManufacture, double value)
	{
		this.regNo = regNo;
		this.make = make;
		this.yearOfManufacture = yearOfManufacture;
		this.value = value;
	}
	
	public String getRegNo()
	{
		return this.regNo;
	}
	
	public String getMake()
	{
		return this.make;
	}
	
	public int getYearofManufacture()
	{
		return this.yearOfManufacture;
	}
	
	public double getValue()
	{
		return this.value;
	}
	
	public void setValue(double value)
	{
		this.value = value;
	}
	
	public int calculateAge(int year)
	{
		return year - yearOfManufacture;
	}
	
	@Override
	public String toString()
	{
		return "Car Reg: " + regNo + '\n' + "Car Make: " + make + '\n' + "Car Year: " + yearOfManufacture + '\n' + "Car Value: " + value;
	}
}
