package exercise4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		double[][] temperature = new double[4][7]; // create 2D array
		// offer menu
		
		do
		{
			System.out.println();
			System.out.println("[1] Enter temperature");
			System.out.println("[2] Display all");
			System.out.println("[3] Display one week");
			System.out.println("[4] Display day of the week");
			System.out.println("[5] Display maximum temperature");
			System.out.println("[0] Exit Program");
			System.out.println("Enter choice [0-5]");
			choice = scanner.nextInt();
			System.out.println();
			
			// process choice by calling additional methods
			switch (choice)
			{
				case 1: 
					enterTemps(temperature, scanner);
					break;
				case 2:
					displayAllTemps(temperature);
					break;
				case 3:
					displayWeek(temperature, scanner);
					break;
				case 4:
					displayDays(temperature, scanner);
					break;
				case 5:
					maxTemp(temperature);
					break;
				case 0:
					System.out.println("Goodbye!");
					break;
				default: System.out.println("ERROR: options 0-6 only");
			}
		} while (choice != 0);
		scanner.close();
	}

	// method to enter temperatures into the 2D array requires a nested loop
	static void enterTemps(double[][] temperatureIn, Scanner scanner) {
		// the outer loop controls the week number and inner controls the day number
		for (int week = 0; week < temperatureIn.length; week++)
			for (int day = 0; day < temperatureIn[week].length; day++)
			{
				System.out.println("enter temperature for week " + (week + 1) + " and day " + (day + 1));
				temperatureIn[week][day] = scanner.nextDouble();
			}
	}
	
	static void displayAllTemps(double[][] temperatureIn)
	{
		System.out.println();
		System.out.println("***TEMPERATURES ENTERED***");
		// the outer loop controls the week number and inner controls the day number
		for (int week = 0; week < temperatureIn.length; week++)
			for (int day = 0; day < temperatureIn[0].length; day++)
				System.out.println("week " + (week+1) + " day " + (day + 1) + ": " + temperatureIn[week][day]);
	}
	
	// method to display temperatures for a single week requires a single loop
	static void displayWeek(double[][] temperatureIn, Scanner scanner)
	{
		int week = 0;
		// input validation: week number should be between 1 and 4
		while (week < 1 || week > 4)
		{
			System.out.println("Enter week number (1-4): ");
			week = scanner.nextInt();
		}
		
		// display temperatures for given week
		System.out.println();
		System.out.println("***TEMPERATURES ENTERED FOR WEEK " + week + "***");
		System.out.println();
		// week number is fixed so loop required to process day numbers only
		for (int day = 0; day < temperatureIn[0].length; day++)
			System.out.println("week " + week + " day " + day +": " + temperatureIn[week-1][day]);
	}
	
	static void displayDays(double[][] temperatureIn, Scanner scanner)
	{
		int day = 0;
		// input validation: day number should be between 1 and 7
		while (day < 1 || day > 7)
		{
			System.out.println("Enter day number (1-7): ");
			day = scanner.nextInt();
		}
		
		// display temperatures for given day of the week
		System.out.println();
		System.out.println("***TEMPERATURES ENTERED FOR DAY " + day + "***");
		System.out.println();
		
		// day number is fixed so loop required to process week numbers only
		for (int week = 0; week < temperatureIn.length; week++)
			System.out.println("week " + (week + 1) + " day " + day + ": " + temperatureIn[week][day-1]);
	}

	static void maxTemp(double[][] temperatureIn) {
		double max = 0;
		for (int i = 0; i < temperatureIn.length; i++)
			for (int j = 0; j < temperatureIn[0].length; j++)
				if (temperatureIn[i][j] > max)
					max = temperatureIn[i][j];
		System.out.println(max);
				
	}
	
}
