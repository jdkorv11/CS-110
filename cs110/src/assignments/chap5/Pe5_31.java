package assignments.chap5;

import java.util.Scanner;

public class Pe5_31 {

	/**
	 * check if a credit card number is valid
	 */
	public static void main(String[] args) {
		long number;
		String printString = " is ";
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a credit card number: ");
		number = input.nextLong();
		input.close();
		
		if (isValid(number)) {
			printString = printString + "valid";
		}
		else {
			printString = printString + "invalid";
		}
		System.out.println(number + printString);
	}
	/** Return true if the credit card number is valid */
	public static boolean isValid(long number) {
		int evenSum;
		int oddSum;
		int sum;
		
		if (getSize(number) < 13 || getSize(number) > 16) return false; 
			
		evenSum = sumOfDoubleEvenPlace(number);
		oddSum = sumOfOddPlace(number);
		sum = evenSum + oddSum;
		
		if (sum % 10 != 0) return false;
		
		for (int i = 0; i < 4; i ++) {
			int startsWith = 0;
			switch (i) {
			case 0:
				startsWith = 4;
				break;
			case 1:
				startsWith = 5;
				break;
			case 2:
				startsWith = 6;
				break;
			case 3:
				startsWith = 37;
			}
			if (prefixMatched(number, startsWith)) return true;
		}
		return false;
	}
	public static int sumOfDoubleEvenPlace(long number) {
		int sumOfDouble = 0;
		int digit;
		String numString = String.valueOf(number);
		for (int i = numString.length() - 2; i >= 0; i -= 2) {
			digit = (numString.charAt(i) - '0'); 
			digit = getDigit(digit * 2);
			sumOfDouble += digit;
		}
		return sumOfDouble;
	}
	public static int sumOfOddPlace(long number) {
		int sum = 0;
		int digit;
		String numString = String.valueOf(number);
		for (int i = numString.length() - 1; i >= 0; i -= 2) {
			digit = (numString.charAt(i) - '0'); 
			digit = getDigit(digit);
			sum += digit;
		}
		return sum;
	}
	public static boolean prefixMatched(long number, int d) {
		long numPrefix = getPrefix(number, getSize(d));
		if (numPrefix == d) return true;
		return false;
	}
	public static int getSize(long d) {
		return (Long.toString(d)).length();
	}
	public static int getDigit(int number) {
		if (number < 10) return number;
		return number - 9;
	}
	public static long getPrefix(long number, int k) {
		String num = String.valueOf(number);
		String pre = "";
		for (int i = 0; i < k; i ++) {
			pre += num.charAt(i);
		}
		return Long.valueOf(pre);
		
	}
}
