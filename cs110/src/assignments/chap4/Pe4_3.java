package assignments.chap4;

public class Pe4_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int kilograms = 1;
		double pounds;
		final double POUNDS_PER_KILOGRAM = 2.2;
		
		System.out.println("Kilograms     Pounds");
		for(; kilograms < 200; kilograms += 2) {
			pounds = kilograms * POUNDS_PER_KILOGRAM;
			System.out.printf("%-3d%17.1f",kilograms,pounds);
			System.out.println();
		}

	}

}
