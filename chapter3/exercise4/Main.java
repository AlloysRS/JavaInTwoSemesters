package exercise4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What exam mark did you get? ");
		int mark = keyboard.nextInt();
		if (mark >= 70)
		{
			System.out.println("Marvelous, you got a distinction");
		}
		else if (mark >= 40)
		{
			System.out.println("Congratulations, you passed");
		}
		else
		{
			System.out.println("WOMP WOMP, you failed");
		}
		System.out.println("Good luck with your other exam!");
		keyboard.close();
	}

}
