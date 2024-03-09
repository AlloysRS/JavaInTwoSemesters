package exercise2;

public class SafeSensor extends Sensor {
	private double max;
	
	public SafeSensor(double max) 
	{
		this.max = max;
	}
	
	public SafeSensor(double max, double pressure)
	{
		super.setPressure(pressure);
		this.max = max;
	}
	
	@Override
	public boolean setPressure(double pressure)
	{
		if (pressure <= max && pressure >= 0)
		{
			super.setPressure(pressure);
			return true;
		}
		return false;
	}
	
	public double getMax()
	{
		return this.max;
	}

}
