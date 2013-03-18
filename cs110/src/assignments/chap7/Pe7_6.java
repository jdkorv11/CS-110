package assignments.chap7;

import java.util.Scanner;

public class Pe7_6 {

	/**
	 * @param args
	 *            sample program for a method that multiplies 2 matrices
	 */
	public static void main(String[] args) {
		double[][] a = new double[3][3];
		double[][] b = new double[3][3];

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3x3 matrix");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = input.nextDouble();
			}
		}
		System.out.println("Enter another 3x3 matrix");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = input.nextDouble();
			}
		}
		input.close();

		double[][] product = multiplyMatrix(a, b);
		System.out.println("The product of your matrices is:");
		for (int row = 0; row < product.length; row++) {
			for (int column = 0; column < product[row].length; column++) {
				System.out.print(product[row][column] + " ");
			}
			System.out.println();
		}

	}

	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		double[][] c = new double[b.length][a.length];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				double value = 0;
				for (int count = 0; count < b.length; count++) {
					value += a[i][count] * b[count][j];
				}
				c[i][j] = value;
			}
		}
		return c;
	}

}
