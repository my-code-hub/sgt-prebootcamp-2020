package com.accenture.bootcamp.exceptions.exercises;

//TODO Run this program and see what happens:
//1) Did it run successfully or there were errors?
//2) What error did program throw?
//3) Add code which will catch and handle the exception which is thrown if
//number is divided by zero. Output text "Can't divide by zero!" if
//number was divided by zero.
public class Exercise21 {

    public static void main(String[] args) {
        System.out.println("dividing numbers...");

        divideNumbers(5, 5);

        divideNumbers(10, 0);

        divideNumbers(10, 5);

        divideNumbers(0, 5);

        System.out.println("Exiting program gracefully. :)");
    }

    static void divideNumbers(int number1, int number2) {
        String text = String.format("%d divided by %d is ", number1, number2);
        try {
            System.out.println(text + (number1 / number2));
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero!");
        }
    }
}
