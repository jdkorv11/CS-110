package practice.loops;

public class NestedLoops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int row = 0; row < 10; row++) {
			System.out.print(row + "| ");
			for (int col = 0; col < 10; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

	}

}
