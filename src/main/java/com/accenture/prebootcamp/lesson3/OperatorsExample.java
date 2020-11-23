package com.accenture.prebootcamp.lesson3;

public class OperatorsExample {

    public static void main(String[] args) {
        System.out.println(2 + 2);
        System.out.println(2 - 2);
        System.out.println(2 * 2);
        System.out.println(2 / 2);
        System.out.println(2 + 2 + 10 / 2 * 10);

        int result = 5 + 5;
        System.out.println(result);

        int result2 = 2 + 2 + 10 / 2 * 10;
        System.out.println(result2);

        System.out.print("result * result2 = ");
        System.out.println(result * result2);

        System.out.println(10 % 3);

        int number1 = -10;
        System.out.println(number1);

        //incremenet by 1
        number1++;
        System.out.println(number1);

        number1--;
        System.out.println(number1);

        //use after or before examples
        int number2 = 0;
        System.out.println(++number2);
        System.out.println(number2++);
        System.out.println(number2);

        int number3 = ++number2;
        System.out.println(number3);
    }
}
