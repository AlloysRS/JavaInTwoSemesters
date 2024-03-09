package exercise1;

public class CircularShape {
	private double radius;
	static double PI = 3.1416;
	

	public CircularShape(double radius)
	{
		this.radius = radius;
	}
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double calculateArea()
	{
		return PI * (radius * radius);
	}
	
	public double calculateCircumference()
	{
		return 2 * (PI * radius);
	}
	
	public double calculateDiameter()
	{
		return 2 * radius;
	}
}
