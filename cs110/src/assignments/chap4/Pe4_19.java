package assignments.chap4;

import java.util.Scanner;

public class Pe4_19 {

	/**
	 * @param args
	 */
	static void printLine(int range, int maxNumber) {
		int power;
		int value;
		for (int i = 0; i < (range - maxNumber); i ++) { //prints spaces before first number on pyramid line
			System.out.print("    ");
		}
		for (int numValue = 1; numValue < maxNumber; numValue ++) {
			power = numValue - 1;
			value =  (int) Math.pow(2, power);
			System.out.printf("%4d", value);
		}
		for (int numValue = maxNumber; numValue > 0; numValue --) {
			power = numValue - 1;
			value =  (int) Math.pow(2, power);
			System.out.printf("%4d", value);
		}		
		System.out.println();
	}
	public static void main(String[] args) {
		int numberOfLines = 8;
		for(int line = 1; line <= numberOfLines; line ++) {
			printLine(numberOfLines, line);
		}

	}

}
