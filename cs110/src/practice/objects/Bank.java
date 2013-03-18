package practice.objects;

public class Bank {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BankAccount acct = new BankAccount(123, 100.00);
		BankAccount acct1 = new BankAccount(456, 500.00);
		
		acct.deposit(400);
		acct1.deposit(400);
		
		acct.withdraw(200);
		acct1.withdraw(200);
		
		System.out.println("done");

	}

}
