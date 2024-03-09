package exercise6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		char again;
		
		do 
		{
			int times = 0;
			
			while (times < 2)
			{
				System.out.println("What times table do you want?");
				times = scanner.nextInt();
			}

			for (int i = 1; i <= 12; i++)
			{
				System.out.println(i + " x " + times + " = " + (i * times));
			}
			
			System.out.println("\nDo you want to run again?");
			again = scanner.next().charAt(0);
			
		} while (again == 'y' || again == 'Y');
		

		scanner.close();
	}
}
