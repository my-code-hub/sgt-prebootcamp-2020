package com.accenture.prebootcamp.lesson11.exercises;

//1) Write a program which creates two dimensional
// array and stores multiplication table (from 1 - 10) in it.
//https://files.slack.com/files-pri/T018VEX4CM6-F019TL41UBW/simtstabula.png
public class Exercise1MultiplicationTable {

    public static void main(String[] args) {
        int size1 = 12;
        int size2 = 12;

        int[][] multiplicationTable = new int[size1][size2];

        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                int n1 = i + 1;
                int n2 = j + 1;
                multiplicationTable[i][j] = n1 * n2;
                System.out.println(n1 + " * " + n2 + " = " + multiplicationTable[i][j]);
            }
            System.out.println("************** ");
        }
    }
}
