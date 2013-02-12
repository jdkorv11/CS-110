package assignments.chap6;

import java.util.Random;
import java.util.Scanner;

public class Pe6_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] integerCounts = new int[10];
		int intEntered;
		for (int i = 0; i < 100; i ++) {
			intEntered = (int)(Math.random() * 10);
			integerCounts[intEntered] ++;
		}
		for(int i = 0; i < 10; i ++) {
			switch (integerCounts[i]) {
			case 1:
				System.out.println(i + " occurs 1 time");
				break;
			default:
				System.out.println(i + " occurs " + integerCounts[i] + " times");
			}
		}

	}

}
