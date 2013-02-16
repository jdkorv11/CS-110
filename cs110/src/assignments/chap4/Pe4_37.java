package assignments.chap4;

import java.util.Scanner;

public class Pe4_37 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number;
		int workingNumber;
		int[] binary = {};
		int[] tempBinary;
		int binaryDigit;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		number = input.nextInt();
		workingNumber = number;
		input.close();
		
		while (workingNumber > 0) {
			//Calculate the binary digit and update workingNumber
			binaryDigit = workingNumber % 2;
			workingNumber = workingNumber / 2;
			//store the binary digit in the binary string 
			tempBinary = binary;
			binary = new int[binary.length + 1]; 
			binary[0] = binaryDigit;
			for (int i = 0; i < tempBinary.length; i ++) {
				binary[i + 1] = tempBinary[i];
			}
			
		}
		System.out.print("The binary equivalent of the number " + number + " is ");
		for (int i = 0; i < binary.length; i ++) {
			System.out.print(binary[i]);
		}
		
	}

}
