package exercise2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int choice;
		Scanner scanner = new Scanner(System.in);
		int[] someArray; // declare an integer array
		System.out.print("How many elements to store: ");
		int size = scanner.nextInt();
		// size the array
		someArray = new int[size];
		//menu
		do
		{
			System.out.println();
			System.out.println("[1] Enter values");
			System.out.println("[2] Find maximum");
			System.out.println("[3] Calculate sum");
			System.out.println("[4] Check membership");
			System.out.println("[5] Search array");
			System.out.println("[6] Display values");
			System.out.println("[7] Display average");
			System.out.println("[8] Display values above average");
			System.out.println("[9] Exit");
			System.out.print("Enter choice [1-9]: ");
			choice = scanner.nextInt();
			System.out.println();
			// process choice by calling additonal methods
			switch (choice)
			{
			case 1: 
				fillArray(someArray, scanner);
				break;
			case 2:
				int max = max(someArray);
				System.out.println("Maximum array value = " + max);
				break;
			case 3:
				int total = sum(someArray);
				System.out.println("Sum of array values = " + total);
				break;
			case 4:
				System.out.print("Enter value to find: ");
				int value = scanner.nextInt();
				boolean found = contains(value, someArray);
				if (found)
					System.out.println(value + " is in the array");
				else
					System.out.println(value + " is not in the array");
				break;
			case 5:
				System.out.println("Enter value to find: ");
				int item = scanner.nextInt();
				int index = search(someArray, item);
				if (index == -999) //indicates value not found
					System.out.println("This value is not in the array");
				else
					System.out.println("This value is at array index " + index);
				break;
			case 6:
				System.out.println("Array values");
				displayArray(someArray);
				break;
			case 7:
			    getAverage(someArray);
			    break;
			case 8:
			    getValuesAboveAverage(someArray);
			    break;
			}
		} while (choice != 9);
		scanner.close();
		System.out.println("Goodbye!");
	}

	// additional methods
	
	// fill an array with values
	static void fillArray(int[] arrayIn, Scanner scanner) {
		for (int i = 0; i < arrayIn.length; i++)
		{
			System.out.println("Enter value: ");
			arrayIn[i] = scanner.nextInt();
		}
	}
	
	// returns the total of all the values held within an array
	static int sum(int[] arrayIn)
	{
		int total = 0;
		for (int currentElement : arrayIn)
			total = total + currentElement;
		return total;
	}
	
	// returns the maximum value in an array
	static int max (int[] arrayIn)
	{
		int result = arrayIn[0]; // set result to the first value in the array
		// this loop runs from the 2nd item to the last item in the array
		for (int i = 1; i < arrayIn.length; i++)
			if (arrayIn[i] > result)
				result = arrayIn[i]; // reset result to new maximum
		return result;
	}
	
	// checks if a given item is contained within the array
	static boolean contains (int valueIn, int... arrayIn)
	{
		// enhanced 'for; loop used here
		for (int currentElement : arrayIn)
			if (currentElement == valueIn)
				return true; // exit loop if value found
		return false;
	}
	
	// returns the position of an item within an array or -999 if the value is not present within the array
	static int search (int[] arrayIn, int valueIn)
	{
		for (int i = 0; i < arrayIn.length; i++)
			if (arrayIn[i] == valueIn)
				return i;
		return -999;
	}
	
	// displays the array values on the screen
	static void displayArray(int[] arrayIn)
	{
		System.out.println();
		// standard 'for' loop used here as the array index is required
		for (int i = 0; i < arrayIn.length; i++)
			System.out.println("array[" + i + "] = " + arrayIn[i]);
	}

	// method to calculate average of array values and display it
	static void getAverage(int[] arrayIn) {
	    double totalSum = sum(arrayIn);
	    double average = totalSum / arrayIn.length;
	    System.out.println("Average array value: " + average);
	}

	// method to display values above the average
	static void getValuesAboveAverage(int[] arrayIn) {
	    double totalSum = sum(arrayIn);
	    double average = totalSum / arrayIn.length;
	    System.out.println("Values above average:");
	    for (int item : arrayIn)
	        if (item > average)
	            System.out.println(item);
	}

}
