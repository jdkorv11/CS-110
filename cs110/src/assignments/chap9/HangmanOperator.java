package assignments.chap9;

import java.util.Scanner;

public class HangmanOperator {

	public String getWord(String[] words) {
		return words[((int) (Math.random() * words.length))];
	}

	public StringBuilder getPrintWord(String word) {
		StringBuilder printWord = new StringBuilder("");
		for (int i = 0; i < word.length(); i++)
			printWord.append("*");
		return printWord;
	}

	public String getGuess(String printWord) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a letter in the word: " + printWord + " ");
		String guess = in.next();
		while (guess.length() != 1) {
			System.out.print("\nInvalid guess. Try again :");
			guess = in.next();
		}
		return guess;
	}

	public StringBuilder replaceAsterisk(String word, StringBuilder printWord,
			String letter) {
		int i = 0;
		while (word.indexOf(letter, i) != -1) {
			i = word.indexOf(letter, i);
			printWord.deleteCharAt(i);
			printWord.insert(i, letter);
			i++;
		}
		return printWord;
	}
}
