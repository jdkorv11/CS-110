package assignments.chap2; 

import java.util.Scanner;

public class Pe22 { //compute volume of a cylinder
	
	public static void main(String[] args) {
		
		float radius;
		float length;
		double area;
		double volume;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input a radius of a cylinder: ");
		radius = scanner.nextFloat();
		
		System.out.println("Input the length of the same cylinder: ");
		length = scanner.nextFloat();
		
		area = radius * radius * Math.PI;
		volume = area * length;
		
		System.out.println("The volume of a cylinder with a radius of "
				+ radius + " and a length of " + length + " is " + volume);
	}
}
