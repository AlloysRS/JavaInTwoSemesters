package exercise4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give weight value in pounds: ");
		double kilos = scanner.nextInt() / 2.2;
		System.out.println("Weight in kilos: " + kilos);
		scanner.close();
	}

}
