package exercise6;

public class BankAccount {
	private String name;
	private int account;
	private double balance;
	
	// Constructor
	public BankAccount(String accountName, int accountNumber)
	{
		this.name = accountName;
		this.account = accountNumber;
		this.balance = 0;
	}
	
	public double getBalance()
	{
		return this.balance;
	}

	public int getAccountNumber() {
		
		return this.account;
	}
	
	public String getAccountName() {
		return this.name;
	}

	public void deposit(double depositAmount) {
		balance += depositAmount;
	}
	
	public void withdraw(double withdrawAmount) {
		balance -= withdrawAmount;
	}

}
