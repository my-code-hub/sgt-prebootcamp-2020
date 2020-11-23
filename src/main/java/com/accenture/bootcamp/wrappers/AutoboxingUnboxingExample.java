package com.accenture.bootcamp.wrappers;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingUnboxingExample {

    public static void main(String[] args) {
        int number = 10;

        //unnecessary autoboxing, java compiler does it for us!
        Integer number2 = new Integer(10);
        Integer number3 = 10;

        // unnecessary unboxing, java compiler does it for us!
        int number4 = number2.intValue();

        int number5 = number2;

        printNumber(number5);
        printNumber(number2);

        printNumber2(number5);
        printNumber2(number2);

        printNumber2(100);

        //comparing wrappers
        Integer n1 = 127;
        Integer n2 = 127;
        Integer n3 = null;

        if (n1 == n2) {
            System.out.println("n1 == n2 - equal!");
        } else {
            System.out.println("n1 == n2 - not equal!");
        }

        if (n1.equals(n2)) {
            System.out.println("n1.equals(n2) - equal!");
        } else {
            System.out.println("not equal!");
        }

        Integer n4 = 300;
        int n5 = 300;

        if (n5 == n4) {
            System.out.println("n5 == n4 - equal");
        } else {
            System.out.println("n5 == n4 - not equal");
        }
    }

    static void printNumber(Integer number) {
        System.out.println(number);
    }

    static void printNumber2(int number) {
        System.out.println(number);
    }

    static void wrappersInCollectionsExamples() {
        int [] numbersArray = new int[5];

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(1);

        int firstNumber = numbers.get(0);
    }

}
