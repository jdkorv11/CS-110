package assignments.chap2;

import java.util.Scanner;

public class Pe27 {

	/**
	Approximate the number of years and days from a number of minutes
	 */
	public static void main(String[] args) {
		
		long minutes;
		long days;
		long years;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("This prigram will approximate how long (in years and days)" + 
		" a time measured in minutes is. \nEnter a number of minutes. ");
		
		minutes = scanner.nextLong();
		
		days = minutes / 1440;
		years = days / 365;
		days = days % 365;
		
		System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
		

	}

}
