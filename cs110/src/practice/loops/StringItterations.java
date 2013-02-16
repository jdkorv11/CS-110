package practice.loops;

import java.util.ArrayList;

public class StringItterations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*String s = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		for (int i = 0; i < s.length(); i ++) {
			System.out.print(s.charAt(i) + " ");
			System.out.println((int) (s.charAt(i)));
			
		}*/
		ArrayList as = new ArrayList();
		as.add("Hello");
		as.add("World");
		as.add("Happy Birthday");
		for (int i = 0; i < as.size(); i ++) {
			System.out.println(as.get(i));
		}
		System.out.println("*****************");
		as.remove(1);
		for (int i = 0; i < as.size(); i ++) {
			System.out.println(as.get(i));
		}
		System.out.println(as.contains("Hello"));

	}

}
