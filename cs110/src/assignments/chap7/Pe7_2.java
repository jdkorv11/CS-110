package assignments.chap7;

import java.util.Scanner;

public class Pe7_2 {

	/**
	 * @param args
	 *            sum the major diagonal of a 4x4 matrix
	 */
	public static void main(String[] args) {
		double[][] matrix = new double[4][4];

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 4-by-4 matrix row by row:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		input.close();

		double sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			sum += matrix[i][i];
		}
		System.out.println("\nThe sum of the major diagonal is " + sum);
	}

}
