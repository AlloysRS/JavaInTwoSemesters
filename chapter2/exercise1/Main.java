package exercise1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); // Create Scanner Object
		double price;
		double tax;
		System.out.println("*** Product Price Check ***");
		System.out.print("Enter initial price: "); // prompt for input
		price = keyboard.nextDouble(); // input method called
		System.out.print("Enter tax rate: "); // prompt for input
		tax = keyboard.nextDouble(); // input method called
		price = price * (1 + tax/100); // perform the calculation
		System.out.println("Cost after tax = " + price);
		keyboard.close();
	}

}
