package assignments.chap5;

import java.util.Random;
import java.util.Scanner;

public class Pe5_17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n;
		int number;
		
		Random randNum = new Random();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		n = input.nextInt();
		input.close();
		
		for (int row = 0; row < n; row++) {
			for (int colum = 0; colum < n; colum ++) {
				number = randNum.nextInt(2);
				System.out.print(" " + number);
			}
			System.out.println();
		}
		
	}

}
