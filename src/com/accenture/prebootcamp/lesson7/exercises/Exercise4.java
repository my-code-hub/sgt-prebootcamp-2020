package com.accenture.prebootcamp.lesson7.exercises;

import java.util.Scanner;

/*
    Write a Java program that determines a student's grade.
    The program will read three types of scores (quiz, mid-term, and final scores)
    and determine the grade based on the following rules:
    * A: average score is equal to or greater than 90%
    * B: average score is equal to or greater than 70% and less than 90%
    * C: average score is equal to or greater than 50% and less than 70%
    * F: average score is less than 50%
    Input:
    Quiz score: 80
    Mid-term score: 68
    Final score: 90
    Output:
    Your grade is B.
*/
public class Exercise4 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Please input quiz score: ");
        int quizScore = userInput.nextInt();
        System.out.print("Please input mid-term score: ");
        int midTermScore = userInput.nextInt();
        System.out.print("Please input final score: ");
        int finalScore = userInput.nextInt();

        double score = (quizScore + midTermScore + finalScore) / 3d;

        if (score >= 90 && score <= 100) {
            System.out.println("Your grade is A.");
        } else if (score >= 70 && score < 90) {
            System.out.println("Your grade is B.");
        } else if (score >= 50 && score < 70) {
            System.out.println("Your grade is C.");
        } else if (score >= 0 && score < 50) {
            System.out.println("Your grade is F.");
        } else {
            System.out.println("One or more of scores were entered incorretly.");
        }

        //another way
        String grade = null;
        if (score >= 90 && score <= 100) {
            grade = "A";
        } else if (score >= 70 && score < 90) {
            grade = "B";
        } else if (score >= 50 && score < 70) {
            grade = "C";
        } else if (score >= 0 && score < 50) {
            grade = "F";
        } else {
            System.out.println("One or more of scores were entered incorretly.");
        }

        if (grade != null) {
            System.out.println("Grade is " + grade);
        }

        userInput.close();
    }
}
