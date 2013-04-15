package assignments.chap10;

public class Account {
	private static double annualInterestRate = 0;
	// interest rates are stored as percentages
	// divide by 100 when using in calculations

	private int id;
	private double balance;

	// private Date dateCreated;

	public Account() {
		final double DEFAULT_BALANCE = 0;
		final int DEFAULT_ID = 0;
		balance = DEFAULT_BALANCE;
		id = DEFAULT_ID;
	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public void withdraw(double amt) {
		balance -= amt;
	}
	
	public void deposit(double amt) {
		balance += amt;
	}

	public static void setAnnualInterestRate(double rate) {
		annualInterestRate = rate;
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static double getMonthlyInterestRate() {
		return (annualInterestRate / 12);
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setID(int id) {
		this.id = id;
	}

	public int getID() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public double getMonthlyInterest() {
		return (balance * (Account.getMonthlyInterestRate() / 100));
	}

	// public Date getDateCreated() { }
}
