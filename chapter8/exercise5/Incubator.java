package exercise5;

public class Incubator {
	private int temperature;
	private static int MAX = 10;
	private static int MIN = -10;
	
	public Incubator()
	{
		this.temperature = 5;
	}
	
	public int getTemperature()
	{
		return this.temperature;
	}
	
	public boolean increaseTemperature()
	{
		if (this.temperature == MAX)
		{
			System.out.println("ALARM");
			return false;
		}
		this.temperature++;
		return true;
	}
	
	public boolean decreaseTemperature()
	{
		if (this.temperature == MIN)
		{
			System.out.println("ALARM");
			return false;
		}
		temperature--;
		return true;
	}
	
}
