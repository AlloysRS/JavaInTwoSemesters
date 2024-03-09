package exercise2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String codeName = "";
		String confirm = "";
		char lastChar = 'A';
		
		System.out.println("Please enter your codename:");
		while (codeName.length() <=6 || lastChar != 'X' || !codeName.startsWith("Agent"))
		{
			codeName = scanner.nextLine();
			if (codeName.length() > 6)
				lastChar = codeName.charAt(codeName.length()-1);
			if (codeName.length() <=6 || lastChar != 'X' || !codeName.startsWith("Agent"))
				System.out.println("INVALID CODENAME, TRY AGAIN");
		}
		
		while (!codeName.equals(confirm))
		{
			System.out.println("Please confirm agent name:");
			confirm = scanner.nextLine();
			if (confirm.equals(codeName))
				System.out.println("CODE NAME CONFIRMED, WELCOME " + codeName);
			else
				System.out.println("CODE NAME MIS-MATCH, TRY AGAIN");
		}
		
		
		scanner.close();
	}

}
