package assignments.chap8;

import java.util.Scanner;

public class Pe8_12 {

	/**
	 * @param args
	 *            prompt the user for the end-points of two line segments, then
	 *            if they intersect give the intersection point to the user
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out
				.print("Enter the endpoints of the first line segment (in the form x1 y1 x2 y2): ");
		double x1_1 = input.nextDouble();
		double y1_1 = input.nextDouble();
		double x1_2 = input.nextDouble();
		double y1_2 = input.nextDouble();
		input.reset();
		System.out.print("Enter the endpoints of the second line segment: ");
		double x2_1 = input.nextDouble();
		double y2_1 = input.nextDouble();
		double x2_2 = input.nextDouble();
		double y2_2 = input.nextDouble();
		input.close();

		EquationBuilder seg1 = new EquationBuilder(x1_1, y1_1, x1_2, y1_2);
		EquationBuilder seg2 = new EquationBuilder(x2_1, y2_1, x2_2, y2_2);

		LinearEquation isect = new LinearEquation(seg1.getXCoeficient(),
				seg1.getYCoeficient(), seg1.getYIntercept(),
				seg2.getXCoeficient(), seg2.getYCoeficient(),
				seg2.getYIntercept());
		double[] intersection = isect.getIntersection();
		SegmentRangeChecker check = new SegmentRangeChecker();
		boolean onSeg1 = check.onSeg(seg1, intersection);
		boolean onSeg2 = check.onSeg(seg2, intersection);

		if (onSeg1 && onSeg2) {
			System.out.println("The line segments intersect at x = "
					+ intersection[0] + " y = " + intersection[1]);
		} else
			System.out.println("The line segments do not intersect");

	}

}
