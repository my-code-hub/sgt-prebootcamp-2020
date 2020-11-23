package com.accenture.prebootcamp.lesson11.exercises;

import java.util.Scanner;

//3. Write a program which asks user to input the size of array. Declare and initialize array of
//   whole numbers with such size. Then ask user to input numbers and fill the array.
//   Then use this array to calculate and output the average value of elements in this array.
//   Hint: for learning purposes, use two loops in this exercise (even though it could be
//   implemented with single loop).
//    1) In first loop just ask the numbers from user and fill the array
//    2) In second loop calculate the average of elements in array.
//
//   Example:
//        Please enter count of numbers: 4
//        1. please enter number: 2
//        2. please enter number: 4
//        3. please enter number: 4
//        4. please enter number: 6
//   Output:
//        Average of 2 4 4 6 is 4
public class Exercise3 {

    public static void main(String[] args) {
        System.out.print("Please enter count of numbers: ");

        Scanner input = new Scanner(System.in);
        int count = input.nextInt();

        //create array and fill it with numbers from user
        int [] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print((i + 1) + ". please enter number: ");
            numbers[i] = input.nextInt();
        }

        //calculate average value of all elements in array
        System.out.print("\nAverage of ");
        int sum = 0;
        for (int i = 0; i < count; i++) {
            int number = numbers[i];
            //same as "sum = sum + number", but shorter;
            sum += number;
            System.out.print(number + " ");
        }
        int average = sum / count;
        System.out.print("is " + average);
    }
}
