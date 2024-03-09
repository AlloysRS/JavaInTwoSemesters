package exercise2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SafeSensor sensor;
		double max = 40;
		double pressure = 10;
		int choice = 0;
		double newPressure = 0;
		
		System.out.println("Sensor Management");
		System.out.println("[1] Create SafeSensor with Max");
		System.out.println("[2] Create SafeSensor with Max and Pressure");
		System.out.println("[0] Create default SafeSensor");
		System.out.println("Select choice (0-2)");
		choice = scanner.nextInt();
		
		switch (choice)
		{
		case 1:
			System.out.println("Choose Max");
			max = scanner.nextDouble();
			sensor = new SafeSensor(max);
			break;
		case 2:
			System.out.println("Choose Max");
			max = scanner.nextDouble();
			System.out.println("Choose Pressure");
			pressure = scanner.nextDouble();
			sensor = new SafeSensor(max, pressure);
			break;
		default:
			System.out.println("Invalid Choice, creating default");
			sensor = new SafeSensor(max, pressure);
		}
		
		do
		{
			System.out.println("[1] Set Pressure");
			System.out.println("[2] Get Pressure");
			System.out.println("[3] Get Max");
			System.out.println("[0] Quit");
			System.out.println("Select choice (0-3)");
			choice = scanner.nextInt();
			
			switch (choice)
			{
			case 1: 
				System.out.println("Input new pressure:");
				newPressure = scanner.nextDouble();
				if (!sensor.setPressure(newPressure))
					System.out.println("CHOSEN PRESSURE TOO HIGH OR BELOW ZERO!!");
				break;
			case 2:
				System.out.println("Pressure is: " + sensor.getPressure());
				break;
			case 3:
				System.out.println("Max is: " + sensor.getMax());
				break;
			case 0:
				break;
			default:
				System.out.println("INVALID CHOICE, CHOOSE 0-3");
			}
		} while (choice != 0);
		scanner.close();
	}
}
