package exercise7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double interestRate = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your deposit amount");
		double money = keyboard.nextDouble();

		System.out.println("Enter your bank account type: A, B, C, X");
		char group = keyboard.next().charAt(0);
		switch(group)
		{
		case 'A': case 'a': case 'C': case 'c':
			if (money >= 250)
				interestRate = 0.015;
			else
				System.out.println("Minimum not met, no interest");
			break;
		case 'B': case 'b': 
			if (money >= 1000)
				interestRate = 0.02;
			else
				System.out.println("Minimum not met, no interest");
			break;
		case 'X': case 'x': 
			if (money >= 5000)
				interestRate = 0.05;
			else
				System.out.println("Minimum not met, no interest");
			break;
		default: 
			System.out.println("No such bank, no interest");
		}
		
		double result = money * (1 + interestRate);
		
		System.out.println("After one year you will have: " + result);
		keyboard.close();
	}

}
