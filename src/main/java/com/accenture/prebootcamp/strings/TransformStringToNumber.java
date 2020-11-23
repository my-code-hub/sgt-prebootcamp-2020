package com.accenture.prebootcamp.strings;

public class TransformStringToNumber {

    public static void main(String[] args) {
        String number = "5";

        int number2 = 5;

        int numberConverted = Integer.parseInt(number);

        if (number2 == numberConverted) {
            System.out.println("They are equal!");
        }
        System.out.println("numberConverted: " + numberConverted);
    }
}
