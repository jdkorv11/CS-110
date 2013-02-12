package assignments.chap6;

import java.util.Scanner;

public class Pe6_1 {

	/**
	 * @param args
	 */
	static char calculateGrade(int score, int bestScore) {
		char grade;
		if (score >= bestScore - 10) {
			grade = 'A';
		}
		else if (score >= bestScore - 20) {
			grade = 'B';
		}
		else if (score >= bestScore - 30) {
			grade = 'C';
		}
		else if (score >= bestScore - 40) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		return grade;
	}
	public static void main(String[] args) {
		int numOfStudents;
		int bestScore = 0;
		char grade;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		numOfStudents = input.nextInt();
		if(numOfStudents < 1) {
			System.out.println("No students. Program terminated.");
			System.exit(1);
		}
		
		int[] score = new int[numOfStudents];
		System.out.print("Enter the " + numOfStudents + " scores: ");
		for (int i = 0; i < numOfStudents; i ++) {
			score[i] = input.nextInt();
			if (score[i] > bestScore) {
				bestScore = score[i];
			}
		}
		input.close();
		
		for (int i = 0; i < numOfStudents; i ++) {
			grade = calculateGrade(score[i], bestScore);
			System.out.println("Student " + i + "'s score is " + score[i] + " and the grade is " + grade);
		}

	}

}
