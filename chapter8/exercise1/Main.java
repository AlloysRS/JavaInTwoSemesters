package exercise1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		CircularShape circle = new CircularShape(5.0);
		circle.setRadius(10.0);
		
		do {
			System.out.println("CIRCLE PROGRAM");
			System.out.println("[1] Set Radius");
			System.out.println("[2] Get Radius");
			System.out.println("[3] Calculate Area");
			System.out.println("[4] Calculate Circumference");
			System.out.println("[5] Calculate Diameter");
			System.out.println("[0] Quit");
			System.out.println("Select Choice (0-5)");
			
			choice = scanner.nextInt();
			
			switch (choice)
			{
				case 1:
					System.out.println("Set new radius: ");
					double radius = scanner.nextDouble();
					circle.setRadius(radius);
					break;
				case 2:
					System.out.println("Radius: " + circle.getRadius());
					break;
				case 3:
					System.out.println("Area: " + circle.calculateArea());
					break;
				case 4:
					System.out.println("Area: " + circle.calculateCircumference());
					break;
				case 5:
					System.out.println("Diameter: " + circle.calculateDiameter());
					break;
				case 0:
					System.out.println("GOODBYE!");
					break;
				default:
					System.out.println("NOT A VALID CHOICE, CHOOSE 0-5");
			}
		} while (choice != 0);
		scanner.close();
	}
}
