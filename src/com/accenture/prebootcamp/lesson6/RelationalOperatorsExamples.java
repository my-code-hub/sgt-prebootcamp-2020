package com.accenture.prebootcamp.lesson6;

public class RelationalOperatorsExamples {

    public static void main(String[] args) {
        int a = 11;
        int b = 10;

        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("b >= a = " + (b >= a));
        System.out.println("b <= a = " + (b <= a));

        System.out.println("******************************");

        boolean result1 = a == b;
        System.out.println("result1 " + result1);

        boolean result2 = a == 11;
        System.out.println("result2 " + result2);

        boolean result3 = 11 == 10;
        System.out.println("result3 " + result3);

        System.out.println("******************************");
        boolean boolean1 = true;
        boolean boolean2 = false;
        System.out.println("boolean1 == boolean2 " + (boolean1 == boolean2));
        System.out.println("boolean1 != boolean2 " + (boolean1 != boolean2));
        System.out.println("boolean1 == true " + (boolean1 == true));
        System.out.println("boolean1 == false " + (boolean1 == false));
    }
}
