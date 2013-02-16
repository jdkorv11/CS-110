package assignments.chap4;

import java.util.Scanner;

public class Pe4_38 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long number;
		long workingNumber;
		char[] hex = {};
		char[] tempHex;
		int hexNum;
		char hexDigit;
		String hexidecimal = "";
		
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
				hexDigit = 'A';
				break;
			case 11:
				hexDigit = 'B';
				break;
			case 12:
				hexDigit = 'C';
				break;
			case 13:
				hexDigit = 'D';
				break;
			case 14:
				hexDigit = 'E';
				break;
			case 15:
				hexDigit = 'F';
				break;
			default:
				hexDigit =Character.forDigit(hexNum,10);
			}
			workingNumber = workingNumber / 16;
			//store the hex digit in the hex string 
			tempHex = hex;
			hex = new char[hex.length + 1]; 
			hex[0] = hexDigit;
			for (int i = 0; i < tempHex.length; i ++) {
				hex[i + 1] = tempHex[i];
			}
			
		}
		for (int i = 0; i < hex.length; i ++) {
			hexidecimal = hexidecimal + hex[i];
		}
		System.out.print("The hexidecimal equivalent of the number " + number + " is " + hexidecimal);
		
	}

}
