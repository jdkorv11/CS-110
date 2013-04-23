package assignments.chap11;

import java.util.Scanner;

public class Pe11_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the three sides of a triangle: ");
		int side1 = input.nextInt();
		int side2 = input.nextInt();
		int side3 = input.nextInt();

		Triangle tri = new Triangle(side1, side2, side3);

		input.reset();
		System.out.print("Enter a color: ");
		tri.setColor(input.next());
		input.reset();
		System.out.print("The triangle is filled (T/F): ");
		String fill = input.next();
		input.close();
		
		if (fill.toLowerCase().contains("t"))
			tri.setFilled(true);
		else
			tri.setFilled(false);

		System.out.println(tri.toString());
		System.out.println("Area: " + tri.getArea() + "\nPerimeter: "
				+ tri.getPerimeter() + "\nColor:" + tri.getColor()
				+ "\nFilled: " + tri.isFilled());
	}
}
