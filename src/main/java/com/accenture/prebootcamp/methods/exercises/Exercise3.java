package com.accenture.prebootcamp.methods.exercises;

import java.util.Scanner;

//3. Implement a method "multiply" which has two parameters (whole numbers, x1 and x2). This method
//   has to multiply these two parameters and output the result.
//   Write a program which uses this method and outputs the result to user.
//   Example:
//        multiply(5, 5); //25
//        multiply(2, 2); //4
public class Exercise3 {

    public static void main(String [] args) {
        multiply(5, 5); //25
        multiply(2, 2); //4

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two whole numbers");
        int skaitlis1 = scanner.nextInt();
        int skaitlis2 = scanner.nextInt();
        multiply(skaitlis1, skaitlis2);
    }

    static void multiply(int x1, int x2) {
        System.out.println(x1 * x2);
    }
}
