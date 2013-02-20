package assignments.chap4;

import java.util.Scanner;

public class Pe4_38 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long number;
		long workingNumber;
		int hexNum;
		String hexDigit = "";
		String hexadecimal = "";
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		number = input.nextInt();
		workingNumber = number;
		input.close();
		
		while (workingNumber > 0) {
			//Calculate the hex digit and update workingNumber
			hexNum = (int) workingNumber % 16;
			switch (hexNum) {
			case 10:
				hexDigit = "A";
				break;
			case 11:
				hexDigit = "B";
				break;
			case 12:
				hexDigit = "C";
				break;
			case 13:
				hexDigit = "D";
				break;
			case 14:
				hexDigit = "E";
				break;
			case 15:
				hexDigit = "F";
				break;
			default:
				hexDigit = Integer.toString(hexNum);
			}
			workingNumber = workingNumber / 16;
			hexadecimal = hexDigit + hexadecimal;
			}			
			System.out.print("The hexadecimal equivalent of the number " + number + " is " + hexadecimal);		
		}		
	}

