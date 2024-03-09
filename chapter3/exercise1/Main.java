package exercise1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give a number: ");
		int num1 = scanner.nextInt();
		System.out.println("Give another number: ");
		int num2 = scanner.nextInt();
		System.out.println("What do you think these summed results in: ");
		int guess = scanner.nextInt();
		if (num1 + num2 == guess)
		{
			System.out.println("ANSWER CORRECT");
		}
		else
		{
			System.out.println("WOMP WOMP, Answer is " + (num1 + num2));
		}
		scanner.close();
	}

}
