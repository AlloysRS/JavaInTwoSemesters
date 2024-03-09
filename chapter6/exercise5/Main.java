package exercise5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char magicSquare[][] = new char[4][4];
	    magicSquare[0] = new char[]{'P', 'R', 'E', 'Y'};
	    magicSquare[1] = new char[]{'L', 'A', 'V', 'A'};
	    magicSquare[2] = new char[]{'O', 'V', 'E', 'R'};
	    magicSquare[3] = new char[]{'T', 'E', 'N', 'D'};
	    
	    displayRow(magicSquare, scanner);
	    displayColumn(magicSquare, scanner);

	    scanner.close();
	}

	static void displayRow(char[][] magicSquare, Scanner scanner) {
		System.out.println("Choose row to display (1-4): ");
		int row = scanner.nextInt();
		for (int i = 0; i < 4; i++)
			System.out.print(magicSquare[row-1][i]);
		System.out.println();
	}

	static void displayColumn(char[][] magicSquare, Scanner scanner) {
		System.out.println("Choose column to display (1-4): ");
		int column = scanner.nextInt();		
		for (int i = 0; i < 4; i++)
			System.out.print(magicSquare[i][column-1]);
		System.out.println();
	}

}
