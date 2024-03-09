package exercise1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double[] temperature = enterTemps();
		//displayTemps(temperature);
		wasHot(temperature);

	}

	static double[] enterTemps() {
		Scanner scanner = new Scanner(System.in);
		double[] temperatureOut = new double[7];
		for (int i = 0; i < temperatureOut.length; i++)
		{
			System.out.println("enter max temperature for day " + (i+1));
			temperatureOut[i] = scanner.nextDouble();
		}
		scanner.close();
		return temperatureOut;
	}
	
	static void displayTemps(double[] temperatureIn) {
		System.out.println();
		System.out.println("***TEMPERATURES ENTERED***");
		System.out.println();
		for (int i = 0; i < temperatureIn.length; i++)
			System.out.println("day " + (i + 1) + " " + temperatureIn[i]);
	}

	static void wasHot(double[] temperatureIn) {
		System.out.println();
		System.out.println("***HOT DAYS ENTERED***");
		System.out.println();
		for (int i = 0; i < temperatureIn.length; i++)
		{
			if (temperatureIn[i] >= 18.0)
				System.out.println(temperatureIn[i]);
		}
	}



}
