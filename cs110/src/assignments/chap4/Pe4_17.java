package assignments.chap4;

import java.util.Scanner;

public class Pe4_17 {

	/**
	 * @param args
	 */
	static void printLine(int range, int maxNumber) {
		for (int i = 0; i < (range - maxNumber); i ++) { //prints spaces before first number on pyramid line
			System.out.print("   ");
		}
		for (int numValue = maxNumber; numValue > 0; numValue --) {//print 1st half of the numbers on the pyramid line
			System.out.printf("%3d", numValue);
		}
		for (int numValue = 2; numValue <= maxNumber; numValue ++) {
			System.out.printf("%3d", numValue);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int numberOfLines;
		int lineCounter;
		
		System.out.print("Enter the number of lines (1 - 15): ");
		Scanner input = new Scanner(System.in);
		numberOfLines = input.nextInt();
		input.close();
		lineCounter = numberOfLines;
		if (numberOfLines > 15) {
			System.out.println("invalid entry");
			System.exit(1);
		}
		
		for(int line = 1; line <= numberOfLines; line ++) {
			printLine(numberOfLines, line);
		}

	}

}
