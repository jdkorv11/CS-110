package assignments.chap5;

import java.util.Scanner;

public class Pe5_25 {

	/**
	 * @param args
	 */
	public static String convertMillis(long millis) {
		final int MILLIS_PER_HOUR = 3600000;
		final int MILLIS_PER_MINUTE = 60000;
		final int MILLIS_PER_SECOND = 1000;
		
		String time;
		
		long hours = millis / MILLIS_PER_HOUR;
		millis = millis % MILLIS_PER_HOUR;
		long minutes = millis / MILLIS_PER_MINUTE;
		millis = millis % MILLIS_PER_MINUTE;
		long seconds = millis / MILLIS_PER_SECOND;
		
		time = Long.toString(hours) + ":" + Long.toString(minutes) + ":" + Long.toString(seconds);
		return time;
	}

	public static void main(String[] args) {
		String time;
		long milliseconds;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of milliseconds: ");
		milliseconds = input.nextLong();
		input.close();
		
		time = convertMillis(milliseconds);
		System.out.println(time);

	}

}
