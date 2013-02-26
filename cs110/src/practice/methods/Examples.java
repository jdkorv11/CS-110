package practice.methods;

public class Examples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 10;
		int b = 11;
		System.out.printf("a = %d b = %d", a, b);
		int c = m1(a);
		System.out.printf("a = %d b = %d c = %d", a,b,c);

	}
	private static int m1(int a) {
		int b = 1;
		a = a + 1;
		System.out.printf("a = %d b = %d", a, b);
		b = m2(a);
		return a + b;
	}
	private static int m2(int a) {
		int b = 2;
		System.out.printf("a = %d b = %d", a, b);
		b = m3(a);
		return a + b;
	}
	private static int m3(int a) {
		int b = 3;
		System.out.printf("a = %d b = %d", a, b);
		return a + b;
	}

}
