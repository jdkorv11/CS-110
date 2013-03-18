package assignments.chap7;

import java.util.Scanner;

public class Pe7_9GamePlay { // game functions for Pe7_9

	Scanner input = new Scanner(System.in);

	public String switchPlayer(String player) {
		if (player == "X")
			player = "O";
		else
			player = "X";
		return player;
	}

	public void printBoard(String[][] moves) {
		System.out.println("-------------");
		for (int row = 0; row < moves.length; row++) {
			for (int column = 0; column < moves[row].length; column++) {
				System.out.print("| " + moves[row][column] + " ");
			}
			System.out.print("|\n-------------\n");
		}
	}

	public String[][] getMove(String[][] moves, String player) {

		boolean valid = false;
		while (!valid) {
			System.out.print("Enter a row (0, 1, or 2) for player " + player
					+ ": ");
			int row = input.nextInt();
			System.out.print("Enter a column (0, 1, or 2) for player " + player
					+ ": ");
			int column = input.nextInt();
			if (row < 0 || row > 3 || column < 0 || column > 3) {
				System.out.println("invalid entry. try again");
			} else if (moves[row][column] == " ") {
				valid = true;
				moves[row][column] = player;
			} else
				System.out.println("invalid move. try again.");
		}

		return moves;
	}

	public boolean winnerCheck(String[][] moves, String player) {
		boolean win = false;
		// check for a horizontal win
		for (int row = 0; row < 3; row++) {
			if (moves[row][0] == player && moves[row][1] == player
					&& moves[row][2] == player)
				win = true;
		}
		// check for a vertical win
		if (!win) {
			for (int column = 0; column < 3; column++) {
				if (moves[0][column] == player && moves[1][column] == player
						&& moves[2][column] == player)
					win = true;
			}
		}
		// check for a diagonal win
		if (!win) {
			if (moves[0][0] == player && moves[1][1] == player
					&& moves[2][2] == player || moves[2][0] == player
					&& moves[1][1] == player && moves[0][2] == player)
				win = true;
		}
		return win;
	}

}
