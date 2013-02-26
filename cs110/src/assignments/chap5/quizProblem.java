package assignments.chap5;

import java.util.Scanner;

public class quizProblem {

	/**
	 * @param args
	 */
    public static boolean isValid(double side1, double side2, double side3) {
    	boolean valid = true;
    	if (side2 + side3 <= side1) {
    		valid = false;
    	}
    	if (side1 + side3 <= side2) {
    		valid = false;
    	}
    	if (side1 + side2 <= side3) {
    		valid = false;
    	}
    	return valid;		
	}
    public static double area(double side1, double side2, double side3) {
    	double s;
    	double area;
    	s = (side1 + side2 + side3) / 2;
    	area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    	return area;
    }
	public static void main(String[] args) {
		double side1;
		double side2;
		double side3;
		double area;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the lengths of the triangle sides: ");
		side1 = input.nextDouble();
		side2 = input.nextDouble();
		side3 = input.nextDouble();
		
		if (isValid(side1, side2, side3)) {
			area = area(side1, side2, side3);
			System.out.println("The area is " + area);
		} 
		else {
			System.out.println("Invalid input. Does not form a real triangle.");
		}
	}

}
