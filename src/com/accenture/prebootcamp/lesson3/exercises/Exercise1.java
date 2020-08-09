package com.accenture.prebootcamp.lesson3.exercises;

/*
  Write a program which swaps the values of these variables
    and outputs the result.
      int x = 5;
      int y = 10;
  */
public class Exercise1 {

    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        System.out.println(x);
        System.out.println(y);

        x = y;
        y = x;

        System.out.println(x);
        System.out.println(y);
    }
}
