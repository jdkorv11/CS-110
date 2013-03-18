package practice.objects;

public class BankAccount {
	private double balance;
	private long accountNumber;
		
	public BankAccount(long accountNumber, double balance) {
		this.balance = balance;
		this.accountNumber = accountNumber;
	}
	public double deposit(double amt) {
		balance += amt;
		return balance;
	}
	public double withdraw(double amt) {
		balance -= amt;
		return balance;
	}

}
