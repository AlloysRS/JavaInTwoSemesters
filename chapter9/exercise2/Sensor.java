package exercise2;

public class Sensor {
	private double pressure;
	
	public Sensor()
	{
		this.pressure = 10;
	}
	
	public Sensor(double pressure)
	{
		this.pressure = pressure;
	}
	
	public boolean setPressure(double pressure)
	{
		this.pressure = pressure;
		return true;
	}
	
	public double getPressure()
	{
		return this.pressure;
	}
}
