package exercise5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean exit = false;
		
		Scanner scanner = new Scanner(System.in);
		do
		{
			System.out.println("Program options:");
			System.out.println("1. Convert Celcius to Fahrenheit");
			System.out.println("2. Convert Fahrenheit to Celcius");
			System.out.println("3. Exit Program");
			int choice = scanner.nextInt();
			
			switch (choice) 
			{
				case 1:
					double fahrenheit = convertCtoF(scanner);
					System.out.println("Fahrenheit is: " + fahrenheit);
					break;
				case 2:
					double celcius = convertFtoC(scanner);
					System.out.println("Celcius is: " + celcius);
					break;
				case 3:
					exit = true;
					break;
			}
		} while (exit == false);
		scanner.close();
	}

    static double convertFtoC(Scanner scanner) {
    	double fahrenheit;
    	do {
            System.out.println("Provide a value in F: ");
            fahrenheit = scanner.nextDouble();
    	} while (fahrenheit < -459.65);
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    static double convertCtoF(Scanner scanner) {
    	double celsius;
    	do {
            System.out.println("Provide a value in C: ");
            celsius = scanner.nextDouble();
    	} while (celsius < -273.15);

        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }

}
