package assignments.chap3;

import java.util.Scanner;

public class Pe3_22 {

	/**
	 * Determine whether a point is within a circle with a center of (0,0) and a radius of 10
	 */
	static float distance(int CENTER_X, int CENTER_Y, float x, float y) {
		float distance;
		float xPart;
		float yPart;
		
		xPart = (x - CENTER_X) * (x - CENTER_X);
		yPart = (y - CENTER_Y) * (y - CENTER_Y);
		distance = (float) Math.sqrt(xPart + yPart);
		return distance;
	}
	public static void main(String[] args) {
		// main method
		// controls flow of and directs program operations
		float x;
		float y;
		int CENTER_X = 0;
		int CENTER_Y = 0;
		int RADIUS = 10;
		float distance;
		
		Scanner input = new Scanner(System.in);
		System.out.println("This program will tell you if a point is inside of a circle\n" + 
		                    "with a radius of " + RADIUS + " and a center at point (0,0).");
		System.out.print("\nEnter a point with 2 coordinates separated by a space (e.g. 4 6): ");
		x = input.nextFloat();
		y = input.nextFloat();
		input.close();
		
		// use the method distance to find the distance the point is from the center of the circle
		distance = distance(CENTER_X, CENTER_Y, x, y);
		
		// check if the distance is greater than the radius
		if (distance > RADIUS) {
			System.out.println("The point (" + x + "," + y + ") is outside the circle.");
		}
		else {
			System.out.println("The point (" + x + ", " + y + ") is inside the circle.");

		}
	}
}
