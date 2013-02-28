package midterm;

public class PrintMonth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int startDay = 5;
		int daysInMonth = 31;
		printMonth(startDay, daysInMonth);
		startDay = 2;
		daysInMonth = 28;
		printMonth(startDay, daysInMonth);
		startDay = 6;
		daysInMonth = 30;
		printMonth(startDay, daysInMonth);

	}
	public static void printMonth(int startDay, int dayInMonth) {
		int dayCount = 0;
		System.out.println("\n\n Sun Mon Tue Wed Thr Fri Sat");
		for (int i = 1; i < startDay; i++){ // move over to the correct start day
			System.out.print("    ");
			dayCount++;
		}
		for (int i = 1; i <= dayInMonth; i++) {
			System.out.printf("%4d", i);
			dayCount++;
			if (dayCount > 6) {
				dayCount = 0;
				System.out.println();
			}
		}
	}
}
