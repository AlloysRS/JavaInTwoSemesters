package exercise4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// When the program starts, two bank accounts are created, with names, and numbers written into the code
		Scanner scanner = new Scanner(System.in);
		ArrayList<BankAccount> accountList = new ArrayList<>();
		
		String accountName;
		int accountNumber;
		int accountCheck;
		int depositAmount;
		boolean accountFound = false;
		char moreDeposits = 'N';
		
		accountName = "account1";
		accountNumber = 111;
		BankAccount account1 = new BankAccount(accountName, accountNumber);
		accountList.add(account1);
		
		accountName = "account2";
		accountNumber = 222;
		BankAccount account2 = new BankAccount(accountName, accountNumber);
		accountList.add(account2);
		
		// The user is then asked to enter an account number, followed by an amount to deposit in that account
		System.out.println("Enter your bank account number:");
		accountCheck = scanner.nextInt();
		
		do
		{
			for (BankAccount account : accountList)
			{
				if(accountCheck == account.getAccountNumber())
				{
					System.out.println("Enter desired deposit amount:");
					depositAmount = scanner.nextInt();
					// The balance of the appropriate account is then updated accordingly and displayed
					accountFound = true;
					System.out.println("Account ID: " + account.getAccountNumber());
					System.out.println("Balance before deposit: " + account.getBalance());
					account.deposit(depositAmount);
					System.out.println("Balance after deposit: " + account.getBalance());
					// The user is then asked if he or she wishes to make more deposits.
					System.out.println("Would you like to make more deposits? Y/N");
					moreDeposits = scanner.next().charAt(0);
				}
			}
			
			// If incorrect account number was entered a message to this effect is displayed.
			if (!accountFound)
				System.out.println("Incorrect account number");
			
			// If the user does not wish to make more deposits, then details of both acocunts are displayed.
			if (moreDeposits != 'Y' && moreDeposits != 'y')
			{	
				System.out.println("====================");
				System.out.println("All Account Details:");
				System.out.println("====================");
				for (BankAccount account: accountList)
				{
					System.out.println("Account ID: " + account.getAccountNumber()); 
					System.out.println("Account Name: " + account.getAccountName()); 
					System.out.println("Account Balance: " + account.getBalance());
				}
			}
		} while (moreDeposits == 'y' || moreDeposits == 'Y');
		
		scanner.close();
	}
}
