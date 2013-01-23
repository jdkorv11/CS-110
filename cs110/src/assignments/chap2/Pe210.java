package assignments.chap2;

import java.util.Scanner;

public class Pe210 {

	/**
	 Calculate the energy required to heat water from an initial temp to a final temp
	 */
	public static void main(String[] args) {
		
		float mass;
		float temp1;
		float temp2;
		float energy;
		float tempDiff;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the mass of water in kilograms? ");
		mass = input.nextFloat();
		
		System.out.println("What is the initial temperature (degrees Celsius)? ");
		temp1 = input.nextFloat();
		
		System.out.println("What is the finial temperature (degrees celsius)? ");
		temp2 = input.nextFloat();	

		tempDiff = temp2 - temp1;
		energy = mass * (temp2- temp1) * 4184; 
				//4184 is the amount of joules required to raise 1 Kg 
				//of water 1 degree celsius
		
		System.out.println("The amount of energy required to raise " + mass + 
				" kilogram(s) of water " + tempDiff + " degrees celsius is " + energy + " joules.");
	}

}
