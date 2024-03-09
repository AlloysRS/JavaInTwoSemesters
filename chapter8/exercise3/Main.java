package exercise3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String tempNumber;
		String tempName;
		double tempPrice;
		
		System.out.println("Enter the stock number:");
		tempNumber = scanner.nextLine();
		System.out.println("Enter the name of the item:");
		tempName = scanner.nextLine();
		System.out.println("Enter the price of the item");
		tempPrice = scanner.nextDouble();
		
		// Create a new item of stock using the values that were entered by the user
		StockItem item = new StockItem(tempNumber, tempName, tempPrice);
		
		// Increase the total number of items in stock by 5
		item.increaseTotalStock(5);
		
		// Display the stock number
		System.out.println(item.getStockNumber());
		
		// Display the total price of all items in stock
		System.out.println(item.getTotalStock());
		System.out.println(item.calculateTotalPrice());
		
		// Set sales tax
		StockItem.setSalesTax(10.0);
		
		
		scanner.close();
	}

}
