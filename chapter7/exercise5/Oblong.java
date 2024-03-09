package exercise5;

public class Oblong {
	private double length;
	private double height;
	private String name;

	public Oblong(String nameValue, double lengthValue, double heightValue) {
		length = lengthValue;
		height = heightValue;
		name = nameValue;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public double getArea()
	{
		return length * height;
	}
	
	public void setHeight(double newHeight)
	{
		height = newHeight;
	}
	
	public void setLength(double newLength)
	{
		length = newLength;
	}
	
	public void printDetails()
	{
		System.out.println("Name: " + name);
		System.out.println("Length: " + length);
		System.out.println("Height: " + height);
		System.out.println("Area: " + (length * height));
		System.out.println();
	}
}
