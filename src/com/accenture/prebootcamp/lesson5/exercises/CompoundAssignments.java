package com.accenture.prebootcamp.lesson5.exercises;

public class CompoundAssignments {

    public static void main(String[] args) {
        int number = 5;
        System.out.println(number);

        number = number - 1;
        System.out.println(number);

        //same as number = number - 1;
        number -= 1;
        System.out.println(number);
    }
}
