package exercise2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an ending number: ");
		int input = scanner.nextInt();
		System.out.println("*** Even numbers from 1 to " + input);
		System.out.println();
		for (int i = 1; i <= input; i++)
		{
			if (i % 2 == 0)
				System.out.println(i + " is even");
			else
				System.out.println(i + " is odd");
		}
		scanner.close();
	}

}
