package exercise6;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		Bank myBank = new Bank();
		
		// offer menu
		do
		{
			System.out.println();
			System.out.println("[1]. Create new account");
			System.out.println("[2]. Remove an account");
			System.out.println("[3]. Deposit money");
			System.out.println("[4]. Withdraw money");
			System.out.println("[5]. Check account details");
			System.out.println("[0]. Quit");
			System.out.println();
			System.out.println("Enter choice [1-6]");
			
			// get choice
			choice = scanner.nextInt();
			System.out.println();
			
			// process menu options
			switch (choice)
			{
				case 1: 
					option1(myBank, scanner);
					break;
				case 2:
					option2(myBank, scanner);
					break;
				case 3:
					option3(myBank, scanner);
					break;
				case 4:
					option4(myBank, scanner);
					break;
				case 5:
					option5(myBank, scanner);
					break;
				case 0:
					break;
				default: System.out.println("Invalid entry");
			}
		} while (choice != 0);
	}
	
	// add account
	static void option1(Bank bankIn, Scanner scanner)
	{
		// get details from user
		System.out.println("Enter account number:");
		int number = scanner.nextInt();
		System.out.println("Enter account name:");
		String name = scanner.nextLine();
		// add account to list
		boolean success = bankIn.addAccount(name, number);
		if (success)
		{
			System.out.println("Account added");
		}
		else
		{
			System.out.println("Account number already exists");
		}
	}
	
	// remove account
	static void option2(Bank bankIn, Scanner scanner)
	{
		// get account number of account to remove
		System.out.println("Enter account number:");
		int number = scanner.nextInt();
		// delete item if it exists
		boolean found = bankIn.removeAccount(number);
		
		if (found)
		{
			System.out.println("Account removed");
		}
		else
		{
			System.out.println("No such account number");
		}
	}
	
	// deposit money in an account
	static void option3(Bank bankIn, Scanner scanner)
	{
		// get details from user
		System.out.println("Enter account number:");
		int number = scanner.nextInt();
		System.out.println("Enter amount to deposit:");
		double amount = scanner.nextDouble();
		
		boolean found = bankIn.depositMoney(number, amount);
		
		if (found)
		{
			System.out.println("Money deposited");
		}
		else
		{
			System.out.println("No such account");
		}
	}
	
	// withdraw money from an account
	static void option4(Bank bankIn, Scanner scanner)
	{
		// get details from user
		System.out.println("Enter account number:");
		int number = scanner.nextInt();
		System.out.println("Enter amount to withdraw:");
		double amount = scanner.nextDouble();
		
		int ok = bankIn.withdrawMoney(number, amount);
		
		if (ok == 0)
		{
			System.out.println("Withdrawal made");
		}
		else
		{
			if (ok == -1)
				System.out.println("INSUFFICIENT FUNDS");
			else if (ok == -2)
				System.out.println("NO SUCH ACCOUNT");
		}
	}
	
	// check account details
	static void option5(Bank bankIn, Scanner scanner)
	{
		// get details from user
		System.out.println("Enter account number:");
		int number = scanner.nextInt();
		
		BankAccount account = bankIn.getItem(number);
		
		if (account != null)
		{
			System.out.println("Account number: " + account.getAccountNumber());
			System.out.println("Account name: " + account.getAccountName());
			System.out.println("Balance: " + account.getBalance());
			System.out.println();
		}
		else
		{
			System.out.println("No such account");
		}
	}
}


