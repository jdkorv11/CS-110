package assignments.wordsearch;

import java.io.FileNotFoundException;

public class WordSearch {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		MazeBuilder maze = new MazeBuilder();
		maze.fillMaze("puzzle");
		WordChecker lookUp = new WordChecker();
		String[] wordList = maze.getWordList("WordList1.0");
		final int NUMBER_OF_WORDS = wordList.length;
		WordVector[] wordVectors = new WordVector[NUMBER_OF_WORDS];
		for(int i = 0; i < NUMBER_OF_WORDS; i++){
			wordVectors[i] = lookUp.findWord(maze.getHorizontalTemplate(), maze.getVerticalTemplate(), wordList[i]);			
			if(wordVectors[i] == null) {
				System.out.println("\"" + wordList[i] + "\" is not found in the puzzle\n");
			}
			else {
				maze.placeAsterisks(wordVectors[i]);
				maze.showFoundWord(wordVectors[i], wordList[i]);
			}

		}
	}

}
