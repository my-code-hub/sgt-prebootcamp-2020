package com.accenture.prebootcamp.lesson4.exercises;

public class Exercise5 {

    public static void main(String[] args) {
        //a)
        int a, b, c;
        a = 0;

        //b System.out.println('ab');
        System.out.println("ab");

        //c System.out.println( (3 + 2) – 1) );
        System.out.println((3 + 2) - 1);

        //d) int d = 3.2;
        float d = 3.2f;

        //e)
        float e = 2.1f;
        float f = e;

        //f)
        float g = 10f;
        float h = 10.50f;
        g = h;

        //g)
        int n;
        {
            n = 10;
        }
        n = 10;
        System.out.println(n);

        //h
        boolean boolean1, boolean2;
        boolean1 = false;
        boolean2 = true;

        //i
        int x;
        x = 1;
        int r = x + 1;

        //j String s = 'This is a string';
        String s = "This is a string";

        //l) long number = 2000000000000000;
        //      System.out.println(number);
        //same as 2000_000_000_000_000L
        long number = 2000_000_000_000_000L;
        System.out.println(number);


        //m) char myChar = "b";
        //   System.out.println(myChar);
        char myChar = 'b';
        System.out.println(myChar);


        //n) final int myNumber = 20;
        //   myNumber++;
        //   System.out.println(myNumber);
        final int myNumber = 20;
        //can't assign another value to final variable
        //myNumber++;
        System.out.println(myNumber);

        //o) float myFloat = 0.5;
        //   System.out.println(myFloat);
        float myFloat = 0.5f;
        System.out.println(myFloat);
    }
}
