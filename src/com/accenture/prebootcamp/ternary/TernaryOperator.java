package com.accenture.prebootcamp.ternary;

public class TernaryOperator {

    public static void main(String[] args) {
        // https://www.tutorialspoint.com/Java-Ternary-Operator-Examples

        System.out.println(true ? "TRUE" : "FALSE");
        System.out.println(false ? "TRUE" : "FALSE");

        int n1 = 1, n2 = 1;
        String result = n1 == n2 ? "equal" : "not equal";
        System.out.println("result: " + result);

        n2 = 2;
        result = n1 == n2 ? "equal" : "not equal";
        System.out.println("result: " + result);
    }
}
