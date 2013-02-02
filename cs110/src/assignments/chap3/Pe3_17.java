package assignments.chap3;

import java.util.Random;
import java.util.Scanner;

public class Pe3_17 {

	/**
	 * plays a game of rock paper scissors with the user
	 */
	public static void main(String[] args) {
		
		int computerChoice;
		int userChoice;
		String user = "";
		String computer = "";
		String result = "";
		
		// get selections for user and computer
		System.out.println("Will you be rock (0), paper (1), or scissors(2)?");
		System.out.print("Enter the numerical value that goes with your choice: ");
		
		Scanner input = new Scanner(System.in);
		userChoice = input.nextInt();
		
		Random rand = new Random();
		computerChoice = rand.nextInt(3);
		
		// Build strings telling what the user and computer were
		switch (userChoice) {
		case 0:
			user = "\nYou are rock, and ";
			break;
		case 1:
			user = "\nYou are paper, and ";
			break;
		case 2:
			user = "\nYou are scissors, and ";
			break;
		default:
			System.out.println("Invalid entry");
			System.exit(0);
		}

		switch (computerChoice) {
		case 0: 
			computer = "the computer is rock.";
			break;
		case 1:
			computer = "the computer is paper.";
			break;
		case 2:
			computer = "the computer is scissors.";
		}
		
		// determine who won and save it to a string
		if (userChoice == 0) {
			switch (computerChoice) {
			case 0:
				result = "\n\nIt is a draw.";
				break;
			case 1:
				result = "\n\nThe computer wins.";
				break;
			case 2:
				result = "\n\nYou win!";
			}
		}
		else if (userChoice == 1) {
			switch (computerChoice) {
			case 0:
				result = "\n\nYou win!";
				break;
			case 1:
				result = "\n\nIt is a draw.";
				break;
			case 2:
				result = "\n\nThe computer wins.";
			}
		}
		else {
			switch (computerChoice) {
			case 0:
				result = "\n\nThe computer wins.";
				break;
			case 1:
				result = "\n\nYou win!";
				break;
			case 2:
				result = "\n\nIt is a draw.";
			}
		}
		//output the result
		System.out.print(user + computer + result);
		

	}

}
