package assignments.chap6;

import java.util.Scanner;

public class Pe6_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] integerCounts = new int[101];
		int intEntered;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter integers between 1 and 100\n(Entering 0 stop the entry): ");
		do {
			intEntered = input.nextInt();
			if (intEntered < 0 || intEntered > 100) {
				System.out.println("Invalid entry");
				System.exit(1);
			}
			integerCounts[intEntered] ++;
		} while (intEntered != 0);
		input.close();
		
		for(int i = 1; i <= 100; i ++) {
			switch (integerCounts[i]) {
			case 0: 
				break;
			case 1:
				System.out.println(i + " occurs 1 time");
				break;
			default:
				System.out.println(i + " occurs " + integerCounts[i] + " times");
			}
		}

	}

}
