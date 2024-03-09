package exercise4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Sensor sensor = new Sensor();
		boolean validSensor;
		
		System.out.println("Pressure: " + sensor.getPressure());
		
		System.out.println("Set new pressure");
		do
		{
			double pressure = scanner.nextDouble();
			validSensor = sensor.setPressure(pressure);
		} while (!validSensor);
		
		System.out.println("Pressure: " + sensor.getPressure());		
		scanner.close();
	}
}
