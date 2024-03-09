package exercise5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give weight value in kilos #.##: ");
		double kilos = scanner.nextDouble();
		System.out.println("Give height value in #.##: ");
		double height = scanner.nextDouble();
		double bmi = kilos / (height*height);
		System.out.println("BMI is: " + bmi);
		if (bmi < 18.5)
		{
			System.out.println("Eat more, you are underweight!");
		}
		else if (bmi > 24.9)
		{
			System.out.println("Whoah Bessie!! Slow down, you are overweight!!");
		}
		else 
		{
			System.out.println("A nice healthy weight! :)");
		}
		scanner.close();
	}

}
