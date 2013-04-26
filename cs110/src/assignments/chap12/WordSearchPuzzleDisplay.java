package assignments.chap12;

import java.awt.GridLayout;
import java.io.FileNotFoundException;

import javax.swing.JFrame;
import javax.swing.JLabel;

import assignments.wordsearch.MazeBuilder;

public class WordSearchPuzzleDisplay {

	public static void main(String[] args) throws FileNotFoundException {
		MazeBuilder wordFind = new MazeBuilder();
		wordFind.fillMaze("puzzle");
		JFrame frame = new JFrame("Word Search");
		String[] puzzle = wordFind.getHorizontalTemplate();
		frame.setLayout(new GridLayout(wordFind.getWidth(), wordFind
				.getHeight()));
		for (String s : puzzle) {
			for (int i = 0; i < s.length(); i++) {
				frame.add(new JLabel(s.substring(i, i + 1), JLabel.CENTER));
			}
		}
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
