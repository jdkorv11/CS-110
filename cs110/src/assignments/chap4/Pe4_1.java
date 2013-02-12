package assignments.chap4;

import java.util.Scanner;

public class Pe4_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] temporary = {0};
		int[] values = {0};
		int count = 0;
		int num = 1;
		int posCount = 0;
		int negCount = 0;
		float sum = 0;
		float average;
		
		Scanner input = new Scanner(System.in);
		
		while (num != 0) {
			System.out.print("Enter an integer, the input ends if it is 0: ");
			count++;
			num = input.nextInt();
			values = temporary;
			temporary = new int[count];
			for (int i = 0; i < count - 1; i ++) {
				temporary[i] = values[i];
			}
			temporary[count - 1] = num;
		}
		input.close();
		// count the number of positive and negative numbers and find the sum of the values
		for (int i = 0; i < values.length; i ++) {
			if (values[i] < 0) {
				negCount ++;
			}
			else if (values [i] > 0) {
				posCount ++;
			}
			sum += values[i];
		}
		average =  (sum / values.length);
		
		System.out.println("\nThe number of positives is " + posCount);
		System.out.println("The number of negatives is " + negCount);
		System.out.println("The total is " + count);
		System.out.println("The average is " + average);
	}
}
