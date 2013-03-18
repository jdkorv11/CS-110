package assignments.chap7;

public class Pe7_9 {

	/**
	 * @param args
	 *            play a game of tic-tac-toe
	 */
	public static void main(String[] args) {
		boolean winner = false;
		int moveCount = 0;
		String player = "O";
		String[][] moves = { { " ", " ", " " }, { " ", " ", " " },
				{ " ", " ", " " } };

		Pe7_9GamePlay game = new Pe7_9GamePlay();

		game.printBoard(moves);

		for (int i = 0; i < 9; i++) {
			moveCount++;
			player = game.switchPlayer(player);
			moves = game.getMove(moves, player);
			game.printBoard(moves);
			winner = game.winnerCheck(moves, player);
			if (winner) {
				System.out.println("player " + player + " wins!");
				break;
			} else if (moveCount == 9) {
				System.out.println("It is a draw.");
			}
		}
	}

}
