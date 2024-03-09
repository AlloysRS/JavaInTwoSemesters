package exercise1;

import java.util.Scanner;

public class Oblong {
    private double length;
    private double height;

    // Constructor
    public Oblong(double length, double height) {
        this.length = length;
        this.height = height;
    }

    // Method to calculate the area
    public double calculateArea() {
        return length * height;
    }
    
    public void setLength(Scanner scanner) {
    	System.out.println("Set new length for oblong");
    	length = scanner.nextDouble();
    	scanner.nextLine();
    }
    
    public void setHeight(Scanner scanner) {
    	System.out.println("Set new length for oblong");
    	height = scanner.nextDouble();
    	scanner.nextLine();
    }
}