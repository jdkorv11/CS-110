package assignments.chap12;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class TicTacToe {
	ImageIcon x = new ImageIcon("images/x.gif");
	ImageIcon o = new ImageIcon("images/o.gif");
	JFrame TicTacToe = new JFrame("Tic-Tac-Toe");
	Random rand = new Random();

	public ImageIcon getSymbol() {
		if (rand.nextInt() % 2 == 0)
			return x;
		else
			return o;

	}
}
