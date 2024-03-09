package exercise2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give a number: ");
		int num1 = scanner.nextInt();
		System.out.println("Give another number: ");
		int num2 = scanner.nextInt();
		if (num1 == num2)
		{
			System.out.println("NUMBERS ARE EQUAL");
		}
		else
		{
			System.out.println("NUMBERS ARE NOT EQUAL");
		}
		scanner.close();
	}

}
