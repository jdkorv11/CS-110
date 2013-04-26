package assignments.chap12;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class DisplayTicTacToe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TicTacToe ttt = new TicTacToe();
		JFrame board = new JFrame("Tic-Tac-Toe");
		
		board.setLayout(new GridLayout(3,3));
		board.add(new JLabel(ttt.getSymbol()));
		board.add(new JLabel(ttt.getSymbol()));
		board.add(new JLabel(ttt.getSymbol()));
		board.add(new JLabel(ttt.getSymbol()));
		board.add(new JLabel(ttt.getSymbol()));
		board.add(new JLabel(ttt.getSymbol()));
		board.add(new JLabel(ttt.getSymbol()));
		board.add(new JLabel(ttt.getSymbol()));
		board.add(new JLabel(ttt.getSymbol()));
		
		board.pack();
		board.setVisible(true);
		
	}

}
