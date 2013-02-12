package assignments.chap4;

import java.util.Scanner;

public class Pe4_9 {

	/**
	 * @param args
	 *  
	 */
	static void getTwoHighScores(String[] names, float[] scores) {
		float highScore = 0;
		float nextHighScore = 0;
		int highScoreIndex = 0;
		int nextHighScoreIndex = 0;
		float transScore;
		int transIndex;
		
		for (int i = 0; i < scores.length; i ++) {
			if (scores[i] > nextHighScore) {
				nextHighScore = scores[i];
				nextHighScoreIndex = i;
				if (nextHighScore > highScore) { //switch highScore and nextHighScore scores and indices
					transScore = highScore;
					highScore = nextHighScore;
					nextHighScore = transScore;
					transIndex = highScoreIndex;
					highScoreIndex = nextHighScoreIndex;
					nextHighScoreIndex = transIndex;
				}
			}
		}
		System.out.println(names[highScoreIndex] + " had the highest score of " + scores[highScoreIndex]);
		System.out.println(names[nextHighScoreIndex] + " had the next highest score of " + scores[nextHighScoreIndex]);
	}
	public static void main(String[] args) {
		int numberOfStudents;
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of Students: ");
		numberOfStudents = input.nextInt();
		String[] names = new String[numberOfStudents];
		float[] scores = new float[numberOfStudents];
		
		System.out.print("Enter the student's names: ");
		for (int i = 0; i < numberOfStudents; i ++) {
			names[i] = input.next();	
		}
	    for (int i = 0; i < numberOfStudents; i ++) {
	    	System.out.print("Enter " + names[i] + "'s score: ");
	    	scores[i] = input.nextFloat();
	    }
	    getTwoHighScores(names, scores);

	}

}
