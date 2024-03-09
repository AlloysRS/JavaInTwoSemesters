package exercise8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("***Lab Times***");
		System.out.println("Enter your group: A, B, C");
		char group = keyboard.next().charAt(0);
		switch(group)
		{
		case 'A': case 'a': System.out.println("10.00 a.m.");
							break;
		case 'B': case 'b': System.out.println("1.00 p.m.");
							break;
		case 'C': case 'c': System.out.println("11.00 a.m.");
							break;
		default: System.out.println("No such group");
		}
		keyboard.close();
	}

}
