package com.accenture.prebootcamp.lesson6;

public class LogicalOperatorsExample {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println(true && true); //true
        System.out.println(true && true && true && false); //false

        System.out.println(true && false && true && true); //false

        int number1 = 0;
        System.out.println(1 == 1 && 10 == 10 && 1 < 5 && (++number1 == 1)); //false
        System.out.println("number1 " + number1);

        System.out.println(true && (number1++ == 2));
        System.out.println("number1 " + number1);

        System.out.println("********************");

        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!(a && b) = " + !(a && b));

        System.out.println("!true" + !true);

        System.out.println("false || false || false = " + (false || false || false));
        System.out.println("false || false || true = " + (false || false || true));

        System.out.println("******************************************");

        int number = 1;
        System.out.println("false || false || true = " + (true || ++number > 0));
        System.out.println("number " + number);

        System.out.println("false || false || true = " + (false && ++number > 0));
        System.out.println("number " + number);


        System.out.println("*****************");
        int x = 5;
        System.out.println(x > 3 && x < 10);

        System.out.println(!(x > 3 && x < 10));
        System.out.println(x > 3 || x < 4);
    }
}
