package assignments.wordsearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MazeBuilder {
	private int[] dimensions = new int[2];
	private String[][] lookUpArray;
	private String[][] displayArray;

	public void fillMaze(String puzzleFileName) throws FileNotFoundException {
		File puzzleFile = new File(puzzleFileName);
		Scanner input = new Scanner(puzzleFile);

		dimensions[0] = input.nextInt();
		dimensions[1] = input.nextInt();

		lookUpArray = new String[dimensions[0]][dimensions[1]];
		for (int row = 0; row < dimensions[0]; row++) {
			for (int col = 0; col < dimensions[1]; col++) {
				lookUpArray[row][col] = input.next();
			}
		}
		input.close();

		displayArray = new String[dimensions[0]][dimensions[1]];
		for (int row = 0; row < dimensions[0]; row++) {
			for (int col = 0; col < dimensions[1]; col++) {
				displayArray[row][col] = lookUpArray[row][col];
			}
		}
	}

	public String[] getHorizontalTemplate() {
		String[] horizontalTemplate = new String[dimensions[0]];
		for (int i = 0; i < dimensions[0]; i++) {
			StringBuffer sb = new StringBuffer();
			for (int j = 0; j < dimensions[1]; j++) {
				sb.append(lookUpArray[i][j]);
			}
			horizontalTemplate[i] = sb.toString();
		}
		return horizontalTemplate;
	}

	public String[] getVerticalTemplate() {
		String[] verticalTemplate = new String[dimensions[1]];
		for (int i = 0; i < dimensions[1]; i++) {
			StringBuffer sb = new StringBuffer();
			for (int j = 0; j < dimensions[0]; j++) {
				sb.append(lookUpArray[j][i]);
			}
			verticalTemplate[i] = sb.toString();
		}
		return verticalTemplate;
	}

	public int[] getDimensions() {
		return dimensions;
	}

	public int getWidth() {
		return dimensions[1];
	}

	public int getHeight() {
		return dimensions[0];
	}

	public String[] getWordList(String wordListName)
			throws FileNotFoundException {
		File wordListFile = new File(wordListName);
		Scanner input = new Scanner(wordListFile);
		int i = input.nextInt();
		String[] wordList = new String[i];
		for (int j = 0; j < i; j++) {
			wordList[j] = input.next();
		}
		input.close();
		return wordList;
	}

	public void placeAsterisks(WordVector wv) {
		int row = wv.getRow();
		int col = wv.getCol();
		int len = wv.getLength();
		Direction d = wv.getDirection();

		for (int i = 0; i < len; i++, row += d.getVerticalStep(), col += d
				.getHorizontalStep()) {
			displayArray[row][col] = "*";
		}
	}

	public void showFoundWord(WordVector wv, String word) {
		System.out.println("\n\"" + word + "\" " + wv.toString() + "\n");
		for (int i = 0; i < dimensions[0]; i++) {
			for (int j = 0; j < dimensions[1]; j++) {
				System.out.print(displayArray[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
