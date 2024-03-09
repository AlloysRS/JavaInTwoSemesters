package exercise9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int option = 0;
		int gumSold = 0;
		int chocSold = 0;
		int cornSold = 0;
		int juiceSold = 0;
		Scanner scanner = new Scanner(System.in);
		
		do
		{
			System.out.println("Vending Machine Options");
			System.out.println("[1] Get gum");
			System.out.println("[2] Get chocolate");
			System.out.println("[3] Get popcorn");
			System.out.println("[4] Get juice");
			System.out.println("[5] Display total sold so far");
			System.out.println("[6] Quit");
			
			System.out.print("Choice: ");
			option = scanner.nextInt();
			
			switch (option)
			{
				case 1: 
					System.out.println("Here is your gum");
					gumSold++;
					break;
				case 2:
					System.out.println("Here is your chocolate");
					chocSold++;
					break;
				case 3:
					System.out.println("Here is your popcorn");
					cornSold++;
					break;
				case 4:
					System.out.println("Here is your juice");
					juiceSold++;
					break;
				case 5:
					System.out.println(gumSold + " items of gum sold");
					System.out.println(chocSold + " items of chocolate sold");
					System.out.println(cornSold + " items of popcorn sold");
					System.out.println(juiceSold + " items of juice sold");
					break;
				case 6:
					break;
				default:
					System.out.println("Error, options 1-6 only!");
			}
			
		} while (option != 6);
		
		scanner.close();
		
	}

}
