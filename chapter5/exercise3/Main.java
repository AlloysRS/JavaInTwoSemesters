package exercise3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = rectLength(scanner);
		int height = rectHeight(scanner);
		int area = length * height;
		System.out.println("Area is: " + area);
		scanner.close();
	}

	static int rectHeight(Scanner scanner) {
		System.out.println("Give rectangle length: ");
		int scannedLength = scanner.nextInt();
		return scannedLength;
	}

	static int rectLength(Scanner scanner) {
		System.out.println("Give rectangle height: ");
		int scannedHeight = scanner.nextInt();
		return scannedHeight;
	}

}
