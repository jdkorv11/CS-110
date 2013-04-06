package assignments.chap9;

import java.util.Scanner;

public class Pe9_12 {

	/**
	 * @param args
	 *            detects whether or not two strings are anagrams
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String s1 = input.nextLine();
		System.out.print("Enter the second string: ");
		String s2 = input.nextLine();
		input.close();

		if (isAnagram(s1, s2))
			System.out.println("The two strings are anagrams.");
		else
			System.out.println("The two strings are not anagrams.");

	}

	public static boolean isAnagram(String s1, String s2) {
		StringBuilder sb1 = new StringBuilder(s1.toLowerCase());
		StringBuilder sb2 = new StringBuilder(s2.toLowerCase());
		sb1.trimToSize();
		sb2.trimToSize();
		if(sb1.length() != sb2.length())
			return false;
		for (int i = 0; i < sb1.length(); i++) {
			Character temp = sb1.charAt(i);
			String s = temp.toString();
			if (sb2.indexOf(s) == -1)
				return false;
			else
				sb2.deleteCharAt(sb2.indexOf(s));
		}
		return true;

	}

}
