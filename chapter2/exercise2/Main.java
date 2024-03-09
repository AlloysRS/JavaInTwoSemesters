package exercise2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// declare variables
		int x;
		int y;
		// enter values
		System.out.print("Enter value for x ");
		x = keyboard.nextInt();
		System.out.print("Enter value for y ");
		y = keyboard.nextInt();
		
		// code to swap variables
		int temp = x;
		x = y;
		y = temp;
		
		// display results
		System.out.println("x = " + x);
		System.out.println("y = " + y);

		keyboard.close();
	}

}
