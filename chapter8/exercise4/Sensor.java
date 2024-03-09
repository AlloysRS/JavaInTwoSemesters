package exercise4;

public class Sensor {
	private double pressure;
	
	public Sensor()
	{
		this.pressure = 0;
	}
	
	public Sensor(double pressure)
	{
		this.pressure = pressure;
	}
	
	public boolean setPressure(double pressure)
	{
		if (pressure < 0)
		{
			System.out.println("INVALID PRESSURE, PLEASE RETRY");
			return false;
		}
		else
			this.pressure = pressure;
		return true;
	}
	
	public double getPressure()
	{
		return this.pressure;
	}
}
