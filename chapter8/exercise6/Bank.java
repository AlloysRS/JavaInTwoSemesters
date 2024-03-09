package exercise6;

import java.util.ArrayList;

public class Bank {
	ArrayList<BankAccount> list = new ArrayList<>();
	
	// helper method to find the index of a specified account
	private int search(int accountNumberIn)
	{
		for (int i = 0; i < list.size(); i++)
		{
			BankAccount tempAccount = list.get(i); // find the account at index i
			int tempNumber = tempAccount.getAccountNumber(); // get account number
			if (tempNumber == accountNumberIn)
			{
				return i; // return the index
			}
		}
		return -999;
	}
	
	// return the total number of items
	public int getTotal()
	{
		return list.size();
	}
	
	// return an account with a particular account number
	public BankAccount getItem(int accountNumberIn)
	{
		int index = search(accountNumberIn);
		if (index != -999) // check that account exists
		{
			return list.get(index);
		}
		else
		{
			return null; // no such account
		}
	}
	
	// add an item to the list
	public boolean addAccount (String nameIn, int accountNumberIn)
	{
		if (search(accountNumberIn) == -999) // check that account does not already exist
		{
			list.add(new BankAccount(nameIn, accountNumberIn)); // add new account
			return true;
		}
		return false;
	}
	
	// deposit money in a specified account
	public boolean depositMoney(int accountNumberIn, double amountIn)
	{
		BankAccount acc = getItem(accountNumberIn);
		if(acc != null)
		{
			acc.deposit(amountIn);
			return true; //indicate success
		}
		else
		{
			return false;
		}
	}
	
	// withdraw money from a specified account 
	public int withdrawMoney(int accountNumberIn, double amountIn)
	{
		BankAccount acc = getItem(accountNumberIn);
		if (acc != null && acc.getBalance() >= amountIn)
		{
			acc.withdraw(amountIn);
			return 1; // indicate success
		}
		else
		{
			if (acc != null)
				return -1;
				//System.out.println("INSUFFICIENT FUNDS");
			else
				return -2;
				//System.out.println("NO SUCH ACCOUNT");
		}
	}
	
	// remove an account
	public boolean removeAccount(int accountNumberIn)
	{
		int index = search(accountNumberIn); // find index of account
		if (index != - 999) // if account exists
		{
			list.remove(index);
			return true; // remove was successful
		}
		else
		{
			return false; // remove was unsuccessful
		}
	}
	
}
