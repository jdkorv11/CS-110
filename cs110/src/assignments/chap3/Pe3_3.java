package assignments.chap3;

import java.util.Scanner;

public class Pe3_3 {

	/**
	 Use Cramer's rule to solve two linear equations 
 	 */
	public static void main(String[] args) {
		float a;
		float b;
		float c; 
		float d;
		float e;
		float f;
		float x;
		float y;
		
		System.out.println("This program will solve two equations given in the following form:");
		System.out.println("ax + by = e\n" +
		                   "cx + dy = f");
		System.out.println("\nEnter a, b, c, d, e, f: ");
		
		Scanner input = new Scanner(System.in);
		a = input.nextFloat();
		b = input.nextFloat();
		c = input.nextFloat();
		d = input.nextFloat();
		e = input.nextFloat();
		f = input.nextFloat();
		
		// use Cramer's rule to solve the equations
		if ((a * d) - (b * c) != 0) {
		    x = ((e * d) - (b * f)) / ((a * d) - (b * c));
		    y = ((a * f) - (e * c)) / ((a * d) - (b * c));
			System.out.println("x is " + x + " and y is " + y);
		}
		else
			System.out.println("The equation has no solution.");

	}

}
