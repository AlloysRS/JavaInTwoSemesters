package exercise6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double totalPrice = 0;
		double pcPrice = 375.99;
		double monitor38 = 75.99;
		double monitor43 = 99.99;
		double avPrice = 65.99;
		double printerPrice = 125.99;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Thank you for ordering a new PC at £" + pcPrice);
		System.out.println("Please choose your monitor: 38 cm at £" + monitor38 + " or 43cm at £" + monitor43);
		int monitorSelection = keyboard.nextInt();
		if (monitorSelection == 38)
		{
			System.out.println("Thank you for choosing the 38cm option");
			totalPrice = pcPrice + monitor38;
		}
		else if (monitorSelection == 43)
		{
			System.out.println("Thank you for choosing the 43cm option");
			totalPrice = pcPrice + monitor43;
		}
		else
		{
			System.out.println("Invalid option, assuming 38cm option");
			totalPrice = pcPrice + monitor38;
		}
		System.out.println("We also have the following extras: ");
		System.out.println("Anti-Virus for £" + avPrice + ": Press 1");
		System.out.println("Printer for £" + printerPrice + ": Press 2");
		System.out.println("Both extras for £" + (avPrice + printerPrice) + ": Press 3");
		System.out.println("No thank you: Press 0");
		int mark = keyboard.nextInt();
		switch (mark)
		{
			case 1:	totalPrice += avPrice;
					System.out.println("Thank you for purchasing Anti-Virus");
					break;
			case 2: totalPrice += printerPrice;
					System.out.println("Thank you for purchasing Printer");
					break;
			case 3: totalPrice = totalPrice + avPrice + printerPrice;
					System.out.println("Thank you for purchasing Anti-Virus and Printer");
					break;
			case 0: break;
			default: System.out.println("Invalid, assuming no extras");
		}
		
		System.out.println("Your total price is: " + totalPrice);
		keyboard.close();
	}

}
