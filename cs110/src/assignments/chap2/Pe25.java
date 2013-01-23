package assignments.chap2;

import java.util.Scanner;

public class Pe25 {

	/**
	 Calculate the gratuity and total payment for a bill
	 */
	public static void main(String[] args) {
		
		float subtotal;
		float gratuityRate;
		float gratuity;
		float total;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is the subtotal of your bill? ");
		subtotal = scanner.nextFloat();
		System.out.println("What is your gratuity rate expressed as a decimal? ");
		gratuityRate = scanner.nextFloat();
		
		gratuity = subtotal * gratuityRate;
		total = subtotal + gratuity;
		
		System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
	}

}
