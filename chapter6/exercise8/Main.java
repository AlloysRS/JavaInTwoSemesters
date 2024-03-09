package exercise8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] triangle = createTriangle();
        displayTriangle(triangle);
        int largestNumber = findLargestNumber(triangle);
        System.out.println("The largest number in the triangle is: " + largestNumber);
    }

    // Method to create the triangle and input values from the user
    public static int[][] createTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows in the triangle:");
        int rows = scanner.nextInt();
        int[][] triangle = new int[rows][];
        for (int i = 0; i < rows; i++) {
            triangle[i] = new int[i + 1];
            System.out.println("Enter " + (i + 1) + " values for row " + (i + 1) + ":");
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        return triangle;
    }

    // Method to display the triangle
    public static void displayTriangle(int[][] triangle) {
        System.out.println("Triangle:");
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++)
                System.out.print(triangle[i][j] + " ");
            System.out.println();
        }
    }

    // Method to find the largest number in the triangle
    public static int findLargestNumber(int[][] triangle) {
        int largest = triangle[0][0];
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (triangle[i][j] > largest) {
                    largest = triangle[i][j];
                }
            }
        }
        return largest;
    }
}
