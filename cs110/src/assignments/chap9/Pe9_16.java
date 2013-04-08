package assignments.chap9;

public class Pe9_16 { // test program for MyString1 class

	public static void main(String[] args) {
		char[] c = { 'T', 'h', 'e', ' ', 'Q', 'u', 'i', 'c', 'k', ' ', 'B',
				'r', 'o', 'w', 'n', ' ', 'F', 'o', 'x' };
		MyString1 s = new MyString1(c);
		System.out.print("MyString1: ");
		myString1Printer(s);
		System.out.println("\nequals: " + s.equals(new MyString1(c)));
		System.out.println("charAt 14: \"" + s.charAt(14) + "\"");
		System.out.println("length: " + s.length());
		System.out.print("Substring 4-9: \"");
		myString1Printer(s.substring(4, 9));
		System.out.print("\"\ntoLowerCase: ");
		myString1Printer(s.toLowerCase());
		System.out.println("\nequals: " + s.equals(new MyString1(c)));
		System.out.print("value of 2: ");
		myString1Printer(MyString1.valueOf(2));

	}

	public static void myString1Printer(MyString1 s) {
		// method used to print MyString1 typed objects
		// solely used for checking methods in MyString1 class
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
		}
	}

}
