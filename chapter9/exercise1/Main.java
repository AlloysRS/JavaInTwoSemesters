package exercise1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose a symbol to represent Oblong");
		char symbol = scanner.next().charAt(0);
		ExtendedOblong extOblong = new ExtendedOblong(10.2, 5.3, symbol);
		System.out.println(extOblong.draw());
		scanner.close();
	}
}
