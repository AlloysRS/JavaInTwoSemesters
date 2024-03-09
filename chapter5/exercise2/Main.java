package exercise2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(poundsToKg());
		System.out.println(kgToPounds());
	}

	private static double poundsToKg() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give weight value in pounds: ");
		double kilos = scanner.nextDouble() / 2.2;
		scanner.close();
		return kilos;
	}
	
	private static double kgToPounds() {
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Give weight value in kilos: ");
		double pounds = scanner2.nextDouble() * 2.2;
		scanner2.close();
		return pounds;
	}

}
