package assignments.chap3;

import java.util.Scanner;

public class Pe3_1 {

	/**
     A program to give the real roots of a quadratic equation
 	 */
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double r1 = 0;
		double r2 = 0;
		double discriminant;
		int discrimSign = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("This program will output the real roots of a quadratic equation expressed\n" +
		"in the form ax^2 + bx + c.");
		System.out.println("What is the value of a? ");
		a = scanner.nextInt();
		System.out.println("What is the value of b? ");
		b = scanner.nextInt();
		System.out.println("What is the value of c? ");
		c = scanner.nextInt();
		
		//use the discriminate to determine how many real roots the expression has
		discriminant = b * b - (4 * a * c);
		// assign case values based on sign of discriminant
		if (discriminant > 0) {
			discrimSign = 1;
		}
		else if (discriminant == 0) {
			discrimSign = 2;
		}
		
		// calculate all real roots or the expression
		switch (discrimSign) {
		case 1: 
			r1 = ((-b) + Math.sqrt((b * b) - (4 * a * c)));
			r1 = r1 / (2 * a);
			
			r2 = ((-b) - Math.sqrt((b * b) - (4 * a * c)));
			r2 = r2 / (2 * a);
			break;
		case 2:
			r1 = ((-b) + Math.sqrt((b * b) - (4 * a * c)));
			r1 = r1 / (2 * a);				
		}
		 // output the real roots
		switch (discrimSign) {
		case 1:
			System.out.println("The real roots are:\n" + r2);
		case 2:
			if (discrimSign == 2){
				System.out.println("The real root is:");
			}
			else {
				System.out.println("and");
			}
			System.out.println(r1);
			break;
		default:
			System.out.println("The equation has no real roots");
		}

	}

}
