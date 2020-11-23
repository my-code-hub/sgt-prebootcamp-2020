package com.accenture.bootcamp.exceptions.exercises;

import java.util.Random;

public class Exercise23 {

    static final Random RANDOM = new Random();
    static final int BOUND = 10;

    //TODO Run this program multiple times and observe the result (write answers to teacher in chat):
        //1) Does it always run successfully? If not, explain why.
        //2) In what ways could you fix program and make sure it always runs without exceptions.
             //Name two approaches and demonstrate them (in code)
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String name = generateName();
            if (name != null) {
                System.out.println(name.concat(" is my name!"));
            }
        }
    }

    static String generateName() {
        int number = RANDOM.nextInt(BOUND);
        if (number < 3) {
            return "John";
        } else if (number < 9) {
            return "Jane";
        } else {
            return null;
        }
    }
}
