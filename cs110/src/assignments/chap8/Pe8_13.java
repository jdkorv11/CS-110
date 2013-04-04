package assignments.chap8;

import java.util.Scanner;

public class Pe8_13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns in the array: ");
		int numOfRows = in.nextInt();
		int numOfCols = in.nextInt();
		double[][] a = new double[numOfRows][numOfCols];
		in.reset();
		System.out.println("Enter the array:");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = in.nextDouble();
			}
		}
		in.close();

		Location thisArr = Location.locateLargest(a);

		System.out.println("The largest element is " + thisArr.maxValue
				+ " and is in row " + thisArr.row + " and column "
				+ thisArr.column);

	}

}
