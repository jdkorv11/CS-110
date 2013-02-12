package assignments.chap4;

public class Pe4_18 {

	/**
	 * @param args
	 */
	static void patternA() {
		System.out.println("Pattern A");
		for (int i = 1; i <= 6; i ++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	static void patternB() {
		System.out.println("Pattern B");
		for (int i = 6; i >= 1; i --) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	static void patternC() {
		System.out.println("Pattern C");
		for (int i = 1; i <= 6; i ++) {
			for (int j = 6; j > i; j --) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	static void patternD() {
		System.out.println("Pattern D");
		for (int i = 6; i >= 1; i --) {
			for (int j = 6; j > i; j --) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		patternA();
		System.out.println();
		patternB();
		System.out.println();
		patternC();
		System.out.println();
		patternD();

	}

}
