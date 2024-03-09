package exercise4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean finished = true;
		do {
			convertCurrency(scanner);
			
			System.out.println("Would you like to convert again? Y/N");
			char check = scanner.next().charAt(0);
			if (check == 'Y' || check == 'y')
				finished = false;
			else
				finished = true;
		} while (finished == false);
		scanner.close();
	}

	static void convertCurrency(Scanner scanner) {
		System.out.println("Enter amount to convert: ");
		double toExchange = scanner.nextDouble();
		exchangeRate(scanner, toExchange);
	}

	static void exchangeRate(Scanner scanner, double money) {
		System.out.println("Give the exchange rate, ie 1.2 to multiply by 1.2: ");
		double exchangeRate = scanner.nextDouble();
		doConversion(money, exchangeRate);
	}

	static void doConversion(double money, double exchangeRate) {
		System.out.println("Processing conversion");
		double convertedCurrency = money * exchangeRate;
		printConversion(convertedCurrency);
	}

	private static void printConversion(double convertedCurrency) {
		System.out.printf("Converted Currency is: CUR %f\n\n", convertedCurrency);
	}

}
