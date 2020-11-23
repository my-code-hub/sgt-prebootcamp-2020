package com.accenture.prebootcamp.overloading;

public class OverloadMethodsExample {

    public static void main(String[] args) {
        OverloadMethodsExample object = new OverloadMethodsExample();

        object.output(100);
        object.output(120L);
        object.output(130.50d);
        object.output(150F);
        object.output("hello");
    }

    void output(int number) {
        System.out.println(number);
    }

    void output(long number) {
        System.out.println(number);
    }

    void output(float number) {
        System.out.println(number);
    }

    void output(double number) {
        System.out.println(number);
    }

    void output(String text) {
        System.out.println(text);
    }
}
