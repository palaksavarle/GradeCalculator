package com.first;

import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("********Enter the number of subjects:********");
		int numSub = scanner.nextInt();

		int[] marks = new int[numSub];
		int total = 0;

		for (int i = 0; i < numSub; i++) {
			System.out.print("Enter marks obtained in subject " + (i + 1) + ": ");
			marks[i] = scanner.nextInt();
			total += marks[i];
		}

		double avgPer = (double) total/ (numSub * 100) * 100;

		System.out.println("Total Marks: " + total);
		System.out.println("Average Percentage: " + avgPer + "%");

		String grade = calculateGrade(avgPer);
		System.out.println("Grade: " + grade);

		scanner.close();
	}

	public static String calculateGrade(double avgPer) {
		if (avgPer >= 90) {
			return "A";
		} else if (avgPer >= 80) {
			return "B";
		} else if (avgPer >= 70) {
			return "C";
		} else if (avgPer >= 60) {
			return "D";
		} else {
			return "F";
		}
	}
}