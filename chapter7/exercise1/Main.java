package exercise1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Oblong oblong1 = new Oblong(3.0, 4.0);
		Oblong oblong2 = new Oblong(5.0, 6.0);
		System.out.println("The area of oblong1 is: " + oblong1.calculateArea());
		System.out.println("The area of oblong2 is: " + oblong2.calculateArea());
		
		oblong1.setLength(scanner);
		oblong1.setHeight(scanner);
		
		System.out.println("The area of oblong1 is: " + oblong1.calculateArea());
		System.out.println("The area of oblong2 is: " + oblong2.calculateArea());
		scanner.close();
	}

}
