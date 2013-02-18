package assignments.chap6;

import java.util.Random;
import java.util.Scanner;

public class Pe6_21 {

	/**
	 * @param args
	 */
	public static int dropABall(int pegsInPath) {
		int direction;
		int slotNumber = 0;
		Random choice = new Random();
		for (int i = 0; i < pegsInPath; i ++) {
			direction = choice.nextInt(2);
			switch (direction) {
			case 0:
				System.out.print("L");
				break;
			case 1:
				System.out.print("R");
				slotNumber ++;
			}
		}
		System.out.println();
		return slotNumber;
	}
	public static void printChartOfBallsInSlots (int[] slotCounts) {
		int highCount = 0;
		String slotOutput;
		
		for(int i = 0; i < slotCounts.length; i ++) {
			if (slotCounts[i] > highCount) {
				highCount = slotCounts[i];
			}
		}
		while (highCount > 0) {
			System.out.print("|");
			for (int i = 0; i < slotCounts.length; i ++) {
				if (slotCounts[i] >= highCount) {
					slotOutput = "O|";
				}
				else {
					slotOutput = " |";
				}
				System.out.print(slotOutput);
			}
			highCount --;
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int numberOfBalls;
		int numberOfSlots;
		int numberOfPegsHit;
		int slot;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of balls to drop: ");
		numberOfBalls = input.nextInt();
		System.out.print("Enter the number of slots in the bean machine: ");
		numberOfSlots = input.nextInt();
		input.close();
		System.out.println();
		
		numberOfPegsHit = numberOfSlots - 1;
		int[] ballsInSlot = new int[numberOfSlots];
		
		//initialize the count of balls in each slot to zero
		for (int i = 0; i < numberOfSlots; i ++) {
			ballsInSlot[i] = 0;
		}
		
		for (int i = 0; i < numberOfBalls; i ++) {
			slot = dropABall(numberOfPegsHit);
			ballsInSlot[slot] ++;
		}
		
		System.out.println();
		printChartOfBallsInSlots(ballsInSlot);

	}

}
