package com.accenture.prebootcamp.methods;

public class MethodsArgumentsExample {

    public static void main(String[] args) {
        int n1 = 10;
        method1(n1);
        System.out.println("n1: " + n1);

        int[] numbers = {10, 20, 30};
        method2(numbers);
        System.out.println(numbers[0]);

        //
        int[] numbers2 = numbers;
        numbers2[1] = -10;

        System.out.println("numbers[1]: " + numbers[1]);
        System.out.println("numbers2[1]" + numbers2[1]);

        //
        numbers = new int[]{5, 6, 7};
        System.out.println("numbers[1]: " + numbers[1]);
        System.out.println("numbers2[1]" + numbers2[1]);

        int [] numbers3 = method3();
        System.out.println(numbers3[0]);
        numbers3 = null;
    }

    static void method1(int a) {
        a = 20;
    }

    static void method2(int[] numbers) {
        numbers[0] = 101;
    }

    static int[] method3() {
        return new int[] {1, 2, 3};
    }
}
