package assignments.chap6;

import java.util.Scanner;

public class Pe6_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] distinctNumbers = new int[0];
		Scanner input = new Scanner(System.in); 
		int num;
		boolean inArray = false;
		
		System.out.print("Enter 10 integers: ");
		for (int i = 0; i < 10; i ++) {
			num = input.nextInt();
			inArray = false;
			for (int j = 0; j < distinctNumbers.length; j ++) { //check if the number is distinct
				if (distinctNumbers[j] == num) {
					inArray = true;
				}
			}
			if (inArray == false) { // add new distinct number to the array
				int [] temp = new int[distinctNumbers.length + 1];
				for (int k = 0; k < distinctNumbers.length; k ++) {
					temp[k] = distinctNumbers[k];
				}
				temp[distinctNumbers.length] = num;
				distinctNumbers = temp;
			}
		
		}
		input.close();
		System.out.print("The distinct numbers are: ");
		for (int i  = 0; i < distinctNumbers.length; i ++) {
			System.out.print(distinctNumbers[i] + " ");
		}

	}

}
