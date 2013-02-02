package assignments.chap2;

import java.util.Scanner;

public class Pe21 {  //example not due in github
	public static void main(String[] args) {
		double fahrenheit;
		double celsius;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a celsius tamperature: ");
		
		celsius = scanner.nextDouble();
		fahrenheit = ((9.0/5) * celsius) + 32;
		System.out.println(celsius + " degrees celsius is " + fahrenheit +
				" degrees fahrenheit.");
	}
}
