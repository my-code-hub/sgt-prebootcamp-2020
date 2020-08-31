package com.accenture.prebootcamp.methods.exercises;

public class Exercise9 {

    // 9. Implement a method "findHighest" which accepts array of
    // whole numbers as argument returns
    // the highest value number in array. Write a program which
    // demonstrates the usage of this method.
    public static void main(String[] args) {
        int[] randomNumbers = {5, 12, 8, 92, 10, 1};
        int result = findHighest(randomNumbers);
        System.out.println("highest number is: " + result);

        int[] randomNumbers2 = {};
        result = findHighest(randomNumbers2);
        System.out.println("highest number in randomNumbers2 is: " + result);

        int[] randomNumbers3 = {-123123, -81273, -123781273};
        result = findHighest(randomNumbers3);
        System.out.println("highest number in randomNumbers3 is: " + result);
    }

    static int findHighest(int[] numbers) {
        if (numbers.length == 0) {
            return Integer.MIN_VALUE;
        }
        // loop trough array
        // declare variable int max;
        int maxValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            int currentValue = numbers[i];
            if (maxValue < currentValue) {
                maxValue = currentValue;
            }
        }
        return maxValue;
    }
}
