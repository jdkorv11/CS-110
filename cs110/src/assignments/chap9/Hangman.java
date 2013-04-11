package assignments.chap9;

import java.util.Scanner;

public class Hangman {
	
	public static void main(String[] args) {
		HangmanOperator cmd = new HangmanOperator();
		String[] words = {"write","radio","dog","potatoe","noose","knot","jib","sword", "avacado", "cyst"};
		int misses = 0;
		String again = "y";
		
		while(again.contains("y") || again.contains("Y")) {	
			String word = cmd.getWord(words);
			StringBuilder printWord = cmd.getPrintWord(word);
			while(!word.equals(printWord.toString())) { 
				String guess = cmd.getGuess(printWord.toString());
				if(word.contains(guess.toUpperCase()) || word.contains(guess.toLowerCase())) 
					printWord = cmd.replaceAsterisk(word, printWord, guess);
				else {
					misses++;
					System.out.println(guess + " is not in the word");
				}
			}
			System.out.println("The word is: " + word + ". You missed " + misses + " time(s)");
			Scanner input = new Scanner(System.in);
			System.out.print("Play again? (Y/N) ");
			again = input.next();
			input.reset();
		}
		
	}
	
}
