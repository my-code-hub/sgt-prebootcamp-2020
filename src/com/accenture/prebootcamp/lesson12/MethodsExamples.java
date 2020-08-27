package com.accenture.prebootcamp.lesson12;

public class MethodsExamples {

    public static void main(String[] args) {
        //no parameters and void return type (no return type)
        sayHello();
        sayHello();
        sayHello();

        // method doesn't return anything
        //String text = sayHello();

        //method with single parameter.
        //when you are calling a method with parameters
        //the values you pass are called arguments
        printNumber(10); //here I'm passing argument with value 10
        printNumber(5); //argument with value 5
        //printNumber("10"); won't work, argument type doesn't match the
        //required parameter type.

        int number = 22;
        printNumber(number);

        int n2 = 55;
        printNumber(n2);
        System.out.println("n2: " + n2);

        printNumber(99);

        System.out.println(" **************** ");
        int result = sum(10, 10);
        System.out.println("result: " + result);

        System.out.println("sum(5, 5) " + sum(5, 5));

        int a = 1, b = 2;
        result = sum(a, b);
        System.out.println("a + b =" + result);

    }

    static void sayHello() {
        System.out.println("Hello, World!");
    }

    static void printNumber(int number) {
        if (number == 99) {
            System.out.println("returning from printNumber()");
            return;
        }

        System.out.println("number is " + number);

        number = 1;
        System.out.println("number after changing to 1: " + number);
    }

    static int sum(int number1, int number2) {
        return number1 + number2;
        // we can also return variables
//        int result = number1 + number2;
//        return result;
    }
}
