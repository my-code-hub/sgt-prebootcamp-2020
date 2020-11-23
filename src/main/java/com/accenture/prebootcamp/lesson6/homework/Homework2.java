package com.accenture.prebootcamp.lesson6.homework;

import java.util.Scanner;

//6) Write a program which asks user to input two whole numbers a and b.
//   Output "true", if one of this condition is true:
//    1) a and b is equal
//    2) a is less than 0 and b is greater than 0
//    3) both of them are greater than 100
//    otherwise output "false":
//    Examples:
//        a is -1 and b is -2 -> false
//        a is -2 and b is 1 -> true
//        a is -1 and b is -1 -> true
//        a is 101 and b is 102 -> true
//        a is 99 and b is 200 -> false
public class Homework2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("please enter a: ");
        int a = input.nextInt();
        System.out.print("please enter b: ");
        int b = input.nextInt();

        System.out.println((a == b) ||
                (a < 0 && b > 0) ||
                (a > 100 && b > 100));

        // another way
        boolean result = (a == b) ||
                (a < 0 && b > 0) ||
                (a > 100 && b > 100);
        System.out.println("result: " + result);

        //and another way
        boolean result1 = a == b;
        boolean result2 = a < 0 && b > 0;
        boolean result3 = a > 100 && b > 100;
        System.out.println(result1 || result2 || result3);
    }
}
