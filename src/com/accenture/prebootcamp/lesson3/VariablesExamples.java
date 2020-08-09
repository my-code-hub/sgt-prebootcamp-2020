package com.accenture.prebootcamp.lesson3;

public class VariablesExamples {

    public static void main(String[] args) {
        //impossible to use variable before declaration
        //System.out.println(x);

        //declaring
        int x;
        int y;
        boolean isTrue;
        long long1, long2, long3;

        //initializing
        x = 5;
        y = 10;
        System.out.println(x);
        System.out.println(y);

        isTrue = true;
        System.out.println(isTrue);

        x = 15;
        System.out.println(x);

        //declare and initialize
        int number = 1;
        System.out.println(number);

        float fractionNumber = 10.10f;
        double fractionNumber2 = 11.50;
        System.out.println(fractionNumber);
        System.out.println(fractionNumber2);

        char letter = 'A';
        System.out.println(letter);

        long long4 = 4, long5 = 5;

        long myLonger = 2000000000000000L;

        //literals
        System.out.println(true);
        System.out.println('N');
        System.out.println(20f);
        System.out.println(2000000000000000l);

        //final variables
        final int number3 = 3;
        System.out.println(number3);

        //numeric promotions
        short tinyValue = 100;
        int bigValue = 30000;

        //casting data type
        tinyValue = (short) bigValue;
        System.out.println(tinyValue);

        bigValue = tinyValue;
    }
}
