package assignments.chap4;

public class Pe4_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int INITIAL_TUITION = 10000;
		double tuition = INITIAL_TUITION;
		final double RATE_OF_INCREASE = 0.05;
		final int RATE_AS_PERCENT = (int) RATE_OF_INCREASE * 100;
		int yearsFromPresent = 10;
		double universityCost = 0;
		final int YEARS_AT_UNIVERSITY = 4;
		
		for (int i=0; i < yearsFromPresent; i++) {
			tuition = tuition + tuition * RATE_OF_INCREASE;
		}
		for (int i = 0; i < YEARS_AT_UNIVERSITY; i ++) {
			universityCost += tuition;
			tuition = tuition + tuition * RATE_OF_INCREASE;
		}
		System.out.print("The cost of attending a university " + yearsFromPresent + " years from now with a current\n" +
				"tuition of $" + INITIAL_TUITION + " and a rate of increase in tuition of " + RATE_AS_PERCENT + "% is $");
		System.out.printf("%8.2f.", universityCost);
		
	}

}
