package exercise7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many items would you like to price?");
		int items = scanner.nextInt();
		
		double[] products = new double[items];
		
		priceProducts(products, scanner);
		
		System.out.println("Product Prices");
		displayProducts(products);
		System.out.println();
		
		double[] convertedProducts = new double[items];
		convertedProducts = convertProducts(products, scanner);
		
		System.out.println("Converted Product Prices");
		//displayProducts(products);
		displayConvertedProducts(convertedProducts);
		System.out.println();
		
		System.out.println("Total costs are: ");
		double totalCur1 = totalProducts(products);
		double totalCur2 = totalProducts(convertedProducts);
		System.out.println("Total Cur 1: " + totalCur1 + " and Total Cur 2: " + totalCur2);
		
		scanner.close();
	}

	static void priceProducts(double[] products, Scanner scanner) 
	{
		System.out.println("Enter price of item: ");
		for (int i = 0; i < products.length; i++)
		{
			System.out.print("Item " + (i + 1) + " price: ");
			double price = scanner.nextDouble();
			products[i] = price;
		}
		System.out.println();
	}
	
	static void displayProducts(double[] products)
	{
		for (double item : products)
			System.out.println(item);
	}
	
	static double[] convertProducts(double[] products, Scanner scanner)
	{
	    System.out.print("Enter the exchange rate, e.g. 1:1.2 for * 1.2, 1:");
	    double exchangeRate = scanner.nextDouble();
	    double[] convertedProducts = new double[products.length]; // Create a new array
	    for (int i = 0; i < products.length; i++)
	        convertedProducts[i] = products[i] * exchangeRate; // Store converted values in the new array
	    return convertedProducts;
	}
	
	static void displayConvertedProducts(double[] convertedProducts)
	{
		for (double item : convertedProducts)
			System.out.println(item);
	}
	
	static double totalProducts(double[] products)
	{
		double totalSum = 0;
		for (double item : products)
			totalSum += item;
		return totalSum;
	}

}
