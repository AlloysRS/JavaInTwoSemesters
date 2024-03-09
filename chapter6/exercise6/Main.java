package exercise6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		double[] products = new double[5];
		
		priceProducts(products, scanner);
		
		System.out.println("Product Prices");
		displayProducts(products);
		System.out.println();
		
		double[] convertedProducts = new double[5];
		convertedProducts = convertProducts(products, scanner);
		
		System.out.println("Converted Product Prices");
		//displayProducts(products);
		displayConvertedProducts(convertedProducts);
		System.out.println();
		
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

}
