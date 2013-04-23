package assignments.chap11;

import java.util.Scanner;

public class Pe11_10 {

	public static void main(String[] args) {
		MyStack foo = new MyStack();
		
		String[] s = new String[5];
		
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			System.out.print("Enter a string: ");
			s[i] = input.nextLine();
			input.reset();
		}
		input.close();
		for(String str: s) {
			foo.add(str);
		}
		for(int i = 0; i < 5; i++) {
			System.out.println(foo.pop());
		}
	}

}
