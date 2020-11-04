package com.accenture.prebootcamp.lesson10.exercises;

//2. Define an array with six arbitrary whole numbers.
//   Write a program that finds second highest number in array and
//   the lowest number in array. Output those numbers.

public class Exercise2 {

    public static void main(String[] args) {
        //another way to create new array
        //15, 15, 3, 12, 13
        //20, 15, 15, 3, 12, 13
        int[] numbers = new int[]{20, 15, 15, 3, 12, 13};

        int highest, secondHighest, lowest = numbers[0];
        highest = secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            //logic for highest and second highest number
            int current = numbers[i];
            if (current > highest) {
                secondHighest = highest;
                highest = current;
            } else if (current > secondHighest && current < highest) {
                secondHighest = current;
            }

            //logic for lowest number
            if (current < lowest) {
                lowest = current;
            }
        }

        System.out.println("Highest: " + highest);
        System.out.println("Second highest: " + secondHighest);
        System.out.println("Lowest: " + lowest);
    }
}
