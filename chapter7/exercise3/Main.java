package exercise3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String string1;
		String string2;
		int comparison;
		
		// get two strings from the user
		System.out.println("Enter a String:");
		string1 = scanner.nextLine();
		System.out.println("Enter another String");
		string2 = scanner.nextLine();
		
		// compare the strings
		comparison = string1.toLowerCase().compareTo(string2.toLowerCase());
		if(comparison < 0) // compareTo returned a negative number
			System.out.println(string1 + " comes before " + string2 + " in the alphabet");
		else if (comparison > 0) // compareTo returned a positive number
			System.out.println(string2 + " comes before " + string1 + " in the alphabet");
		else // compareTo returned zero
			System.out.println("The strings are identical");
		scanner.close();
		
		System.out.println("Are strings equal? " + string1.equalsIgnoreCase(string2));
		
		System.out.println("Trimmed strings are:");
		System.out.println("String 1: " + string1.trim());
		System.out.println("String 2: " + string2.trim());
	}

}
