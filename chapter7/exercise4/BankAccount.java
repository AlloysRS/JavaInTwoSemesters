package exercise4;

public class BankAccount {
	private String name;
	private int account;
	private int balance;
	
	// Constructor
	public BankAccount(String accountName, int accountNumber)
	{
		this.name = accountName;
		this.account = accountNumber;
		this.balance = 0;
	}
	
	public int getBalance()
	{
		return this.balance;
	}

	public int getAccountNumber() {
		
		return this.account;
	}
	
	public String getAccountName() {
		return this.name;
	}

	public void deposit(int depositAmount) {
		balance += depositAmount;
	}

}
