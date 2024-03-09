package exercise4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		
		// offer menu
		do
		{
			System.out.println();
			System.out.println("[1]. Add a vehicle;");
			System.out.println("[2]. Display a list of vehicle details");
			System.out.println("[3]. Delete a vehicle");
			System.out.println("[0]. Quit");
			System.out.println();
			System.out.println("Enter choice [0-3]");
			
			// get choice
			choice = scanner.nextInt();
			scanner.nextLine();
			System.out.println();
			
			// process menu options
			switch (choice)
			{
				case 1: 
					option1(vehicles, scanner);
					break;
				case 2:
					option2(vehicles, scanner);
					break;
				case 3:
					option3(vehicles, scanner);
					break;
				case 0:
					break;
				default: System.out.println("Invalid entry");
			}
		} while (choice != 0);
		scanner.close();
	}



	private static void option1(ArrayList<Vehicle> vehicles, Scanner scanner) {
		System.out.println("Enter Reg: ");
		String regNo = scanner.nextLine();
		System.out.println("Enter Make: ");
		String make = scanner.nextLine();
		System.out.println("Enter year of manufacture: ");
		int yearOfManufacture = scanner.nextInt();
		System.out.println("Enter value of car: ");
		double value = scanner.nextDouble();
		scanner.nextLine();
		vehicles.add(new Vehicle(regNo, make, yearOfManufacture, value)); // add new vehicle
	}
	
	private static void option2(ArrayList<Vehicle> vehicles, Scanner scanner) {
		System.out.println("Vehicle Details");
		for (Vehicle vehicle : vehicles)
		{
			System.out.println(vehicle);
			System.out.println();
		}
	}
	
	private static void option3(ArrayList<Vehicle> vehicles, Scanner scanner) {
	    System.out.println("Enter Reg:");
	    String regNoToDelete = scanner.nextLine();
	    boolean found = false;

	    for (int i = 0; i < vehicles.size(); i++) {
	        if (vehicles.get(i).getRegNo().equals(regNoToDelete)) {
	            vehicles.remove(i);
	            System.out.println("Reg Number " + regNoToDelete + " has been deleted.");
	            found = true;
	            break; 
	        }
	    }
	    if (!found) {
	        System.out.println("Reg Number " + regNoToDelete + " does not exist.");
	    }
	}
}

