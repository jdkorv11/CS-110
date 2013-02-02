package assignments.chap3;

import java.util.Scanner;

public class PE3_32 {

	/**
	 * Get three points and determine if the 3rd is on the same line as the other two, 
	 * to the right of the line, or to the left of the line
	 */
	static int proximityCheck(float x0, float y0, float x1, float y1, float x2, float y2) {
		// check where (x2, y2) is compared to a line drawn through (x0, y0) and (x1, y1)
		float checkValue;
		int checkResult;
		checkValue = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		// assign value 0, 1, or 2 to checkResult or designate whether the point is 
		// to the left of, on, or to the right of the line respectively
		if (checkValue > 0) {
			checkResult = 0;
		}
		else if (checkValue == 0) {
			checkResult = 1;
		}
		else {
			checkResult = 2;
		}
		return checkResult;
	}
	public static void main(String[] args) {
		// main method
		// controls program flow and execution
		float x0;
		float x1;
		float x2;
		float y0;
		float y1;
		float y2;
		
		Scanner input = new Scanner(System.in);
		System.out.println("This program will tell you where a third point is compared to\n" + 
				"a line drawn between two other points.");
		System.out.print("Enter three points (the line will be drawn between the first two)\n" + 
				"(e.g. 2 4   3.5 -6   4 -2): ");
		x0 = input.nextFloat();
		y0 = input.nextFloat();
		x1 = input.nextFloat();
		y1 = input.nextFloat();
		x2 = input.nextFloat();
		y2 = input.nextFloat();
		input.close();
		
		// check where the point x2,y2 is compared to the line drawn between the x0,y0 and x1, y1
		int proximity = proximityCheck(x0, y0, x1, y1, x2, y2);
		
		// build a string to output the proximity to the user
		String place = "";
		switch (proximity) {
		case 0:
			place = "to the left of the ";
			break;
		case 1:
			place = "on the same line as the ";
			break;
		case 2:
			place = "to the right of the ";
		}
		
		System.out.println("The point (" + x2 + ", " + y2 + ") is " + place + "line drawn between " + 
							"the points (" + x0 + ", " + y0 + ") and (" + x1 + ", " + y1 + ").");
	}

}
