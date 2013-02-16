package assignments.chap4;

public class Pe4_25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double pi;
		double loopCount;
		int maxValue;
		for (int trial = 1; trial <= 10; trial ++){
			loopCount = 0;
			maxValue = trial * 10000;
			for (int i = 1; i <= maxValue; i ++) {
				loopCount += (Math.pow(-1, (i + 1))/((2 * i) - 1));
			}
			pi = 4 * loopCount;
			System.out.println("When i = " + maxValue + " pi is approximated as " + pi);
		}

	}

}
