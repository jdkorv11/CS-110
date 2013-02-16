package practice.loops;

public class NameTenTimes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double values[];
		double total = 0;
		
		values = new double[10];
		
		for (int i = 0; i < values.length; i++ ) {
			values[i] = i;
		}
		for (int i = 0; i < values.length; i++ ) {
			total += values[i];
		}
		System.out.println(total + "\n" + total / values.length);
	}
}
