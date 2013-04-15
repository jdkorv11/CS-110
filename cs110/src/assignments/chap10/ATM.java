package assignments.chap10;

import java.util.Scanner;

public class ATM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Account[] ATM = { new Account(0, 100), new Account(1, 100),
				new Account(2, 100), new Account(3, 100), new Account(4, 100),
				new Account(5, 100), new Account(6, 100), new Account(7, 100),
				new Account(8, 100), new Account(9, 100)};
		
		Scanner input = new Scanner(System.in);
		int id = -1;
		int choice = 0;
		boolean exit;
		double amt;
		
		while(true) {
			exit = false;
			while(true) {
				System.out.print("Enter an ID: ");
				id = input.nextInt();
				if(0 <= id && id <= 9) break;
				System.out.println("Invalid entry");				
			}
			input.reset();
			while(! exit) {
				System.out.print("\n----Main Menu----\n" +
								 "1: Check balance\n" +
								 "2: Withdraw\n" +
								 "3: Deposit\n" +
								 "4: exit\n" +
								 "Enter a choice: ");
				choice = input.nextInt();			
				switch(choice) {
				case 1: 
					System.out.println("The balance is " + ATM[id].getBalance());
					break;
				case 2: 
					input.reset();
					System.out.print("Enter the amount to withdraw: ");
					amt = input.nextDouble();
					ATM[id].withdraw(amt);
					break;
				case 3:
					input.reset();
					System.out.print("Enter the amount to deposit: ");
					amt = input.nextDouble();
					ATM[id].deposit(amt);
					break;
				case 4:
					exit = true;
					break;
				default:
					System.out.print("Invalid choice");
				}
			}
		}
	}
}
