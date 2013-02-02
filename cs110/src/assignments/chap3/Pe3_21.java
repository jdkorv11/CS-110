package assignments.chap3;

import java.util.Scanner;

public class Pe3_21 {

	/**
	 * Uses Zeller's congruence to tell what day of the week a date is
	 */
	
	static void checkInputs(int month, int day) {
		// check if month and day are invalid inputs
		boolean badInput = false;
		if (month < 1 || month > 12) {
			System.out.println("Invalid month");
			badInput = true;
		}
		if (day < 1 || day > 31) {
			System.out.println("Invalid day");
			badInput = true;
		}
		if (badInput) {
			System.exit(1);
		}
		// make sure the month and day combination exists (always allows Feb. 29th)
			// months are numbered 1-12
		switch (month) {
		case 2:
			if (day > 29) {
				System.out.println("\nInvalid month and day combination");
				System.exit(1); 
			}
		case 4:
		case 6:
		case 9:
		case 11:
			if (day > 30) {
				System.out.println("Invalid month and day combination");
				System.exit(1);
			}
		}
	}
	static int[] splitYear(int year) {
		//Splits a year into what century and what year of that century it is
		//then returns an array in the format [century, year of century]
		int century;
		int yearOfCentury;
		
		century = (int) year / 100;
		yearOfCentury = (int) year % 100;
		int yearInfo[] = {century, yearOfCentury};
		
		return yearInfo;
	}
	static void weekDay(int dayNumber) {
		// prints the day of the week based on the pattern:
		// 0: Saturday, 1: Sunday, 2: Monday, etc.
		String day = "";
		switch (dayNumber) {
		case 0:
			day = "Saturday";
			break;
		case 1:
			day = "Sunday";
			break;
		case 2:
			day = "Monday";
			break;
		case 3:
			day = "Tuesday";
			break;
		case 4:
			day = "Wednesday";
			break;
		case 5:
			day = "Thursday";
			break;
		case 6: 
			day = "Friday";			
		}
		System.out.println("That date is a " + day + ".");
	}
	
	public static void main(String[] args) {
		// main method
    		// controls program operation
		int year;
		int month;
		int dayOfMonth;
		int century;
		int yearOfCentury; 
		int dayOfWeek;
		int[] yearParts;
		
		// Get the year, month, and day
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year (e.g. 2012): ");
		year = input.nextInt();
		System.out.print("Enter month (1-12): ");
		month = input.nextInt();
		System.out.print("Enter the day of the month (1-31): ");
		dayOfMonth = input.nextInt();
		
		// make sure inputs are valid
		checkInputs(month, dayOfMonth);
		
		//make adjustment for January and February being months 13 and 14 of previous year
		switch (month){
		case 1:
			year -= 1;
			month = 13;
			break;
		case 2:
			year -= 1;
			month = 14;
			break;
		}	
		// use the method splitYear to divide the year into century and yearOfCentury
		yearParts = splitYear(year);
		century = yearParts[0];
		yearOfCentury = yearParts[1];
		
		// calculate the day of the week
		dayOfWeek = (int) (dayOfMonth + ((26 * (month + 1)) / 10) + yearOfCentury + 
				           (yearOfCentury / 4) + (century / 4) + (5 * century)) % 7;
		
		// output the day of the week 
		weekDay(dayOfWeek);
	}
	
}
