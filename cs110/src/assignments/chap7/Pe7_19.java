package assignments.chap7;

import java.util.Scanner;

public class Pe7_19 {

	/**
	 * @param args
	 *            a sample program to check for 4 consecutive numbers of the
	 *            same value in a 2-D array
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of rows: ");
		int rows = input.nextInt();
		System.out.print("Enter the number of columns: ");
		int columns = input.nextInt();

		if (rows < 1 || columns < 1) {
			System.out.println("\ninvalid input");
			System.exit(-1);
		}
		int[][] values = new int[rows][columns];
		// get values for the matrix
		for (int row = 0; row < rows; row++) {
			System.out.println("Row " + row);
			for (int column = 0; column < columns; column++) {
				System.out.print("Enter the next value: ");
				values[row][column] = input.nextInt();
			}
		}
		input.close();

		boolean isFour = isConsecutiveFour(values);
		String s = "";

		if (isFour) {
			s = "There are 4 consecutive same numbers in the matrix.";
		} else {
			s = "There are not 4 consecutive same numbers in the matrix.";
		}
		System.out.println("\n" + s);

	}

	public static boolean isConsecutiveFour(int[][] values) {
		int numOfRows = values.length;
		int numOfColumns = values[0].length;

		if (numOfColumns >= 4) { // check horizontally
			for (int i = 0; i < numOfRows; i++) { // cycle through each row
				for (int j = 0; j < numOfColumns - 3; j++) { // trial starts (at least 3 behind)
					boolean thisSet = true;
					int num1 = values[i][j];
					for (int k = j + 1, tryCount = 0; tryCount < 4 && thisSet; k++, tryCount++) {
						int num2 = values[i][k];
						if (num1 != num2)
							thisSet = false;
					}
					if (thisSet)
						return true;
				}
			}
		}
		if (numOfRows >= 4) { // check vertically
			for (int i = 0; i < numOfRows - 3; i++) { // cycle through each row with at least 3 row beneath
				for (int j = 0; j < numOfColumns; j++) { // trial starts
					boolean thisSet = true;
					int num1 = values[i][j];
					for (int k = i + 1, tryCount = 0; tryCount < 4 && thisSet; k++, tryCount++) {
						int num2 = values[k][j];
						if (num1 != num2)
							thisSet = false;
					}
					if (thisSet)
						return true;
				}
			}
		}
		if (numOfRows >= 4 && numOfColumns >= 4) {
			// first check negative sloped diagonals
			for (int i = 0; i < numOfRows - 3; i++) { // cycle through each row with at least 3 rows beneath
				for (int j = 0; j < numOfColumns - 3; j++) { // trial starts (at least 3 behind)
					boolean thisSet = true;
					int num1 = values[i][j];
					for (int k = i + 1, m = j + 1, tryCount = 0; tryCount < 3 && thisSet; k++, m++, tryCount++) {
						int num2 = values[k][m];
						if (num1 != num2)
							thisSet = false;
					}
					if (thisSet)
						return true;
				}
			}
			// check positively sloped diagonals
			for (int i = numOfRows - 1; numOfRows >= 0; i--) { // cycle through rows from bottom up with at least 3 rows above
				for (int j = 0; j < numOfColumns - 3; j++) { // trial starts (at least 3 behind)
					boolean thisSet = true;
					int num1 = values[i][j];
					for (int k = i - 1, m = j + 1, tryCount = 0; tryCount < 3 && thisSet; k--, m++, tryCount++) {
						int num2 = values[k][m];
						if (num1 != num2)
							thisSet = false;
					}
					if (thisSet)
						return true;
				}
			}
		}
		return false;
	}

}
