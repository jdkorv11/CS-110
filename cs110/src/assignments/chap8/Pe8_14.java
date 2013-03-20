package assignments.chap8;

import java.util.Random;

public class Pe8_14 {

	/**
	 * @param args
	 *            test program for the class StopWatch
	 */
	public static void main(String[] args) {
		
		Random r = new Random(System.currentTimeMillis());
		int[] list = new int[100000];
		
		for(int i = 0; i < 100000; i++) {
			list[i] = r.nextInt();
		}
		
		StopWatch timer = new StopWatch();
		
		java.util.Arrays.sort(list);
		
		timer.stop();
		
		long time = timer.getElapsedTime();
		
		System.out.println("It took " + time + " milliseconds to sort an array of 100,000 random integers.");

	}

}
