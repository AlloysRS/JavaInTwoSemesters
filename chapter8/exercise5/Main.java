package exercise5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Incubator incubator = new Incubator();
		int choice = 0;
		System.out.println("INCUBATOR STATION");
		System.out.println("[1] Get Temperature");
		System.out.println("[2] Increase Temperature");
		System.out.println("[3] Decrease Temperature");
		System.out.println("[0] Quit");

		do {
			choice = scanner.nextInt();
			switch (choice) 
			{
				case 1:
					System.out.println("Current Temperature: " + incubator.getTemperature());
					break;
				case 2:
					System.out.println("Increasing Temperature by 1");
					incubator.increaseTemperature();
					break;
				case 3:
					System.out.println("Decreasing Temperature by 1");
					incubator.decreaseTemperature();
					break;
				case 0:
					System.out.println("Goodbye!");
					break;
				default:
					System.out.println("Invalid Choice, choose 0-3");
			}
		} while (choice != 0);
		scanner.close();
	}
}
