package com.accenture.prebootcamp.varargs;

public class VarargsExample {

    public static void main(String[] args) {
        printNumbers();
        printNumbers(1, 10);
        printNumbers(5);
        printNumbers(5, 6, 1, 2, 4, 6, 7, 9, 0, 123);

        String.format("Hello, my age is %d", 20);
    }

    static void printNumbers(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    static void printNames(int age, int number1, String... names) {

    }
}
