package exercise7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		char again;
		
		do
		{
			int num = 0;
			
			while (num < 2 || num > 20)
			{
				System.out.println("Size of square:");
				num = scanner.nextInt();
			}
			
			for (int i = 0; i < num; i++)
			{
				for (int j = 0; j < num; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println("Make another square? Y/N");
			again = scanner.next().charAt(0);
		} while (again == 'y' || again == 'Y');
		

		scanner.close();
	}

}
