package exercise8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final double PI = 3.1416;
		double radius = -1.00;
		while (radius <= 0)
		{
			System.out.println("Give circle radius: ");
			radius = scanner.nextDouble();
		}

		double area = PI * (radius * radius);
		double circumference = 2 * (PI * radius);
		System.out.println("Radius of: " + radius + " results in: " + area + " area and " + circumference + " circumference");
		scanner.close();
	}
}
