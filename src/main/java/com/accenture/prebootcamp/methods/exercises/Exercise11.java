package com.accenture.prebootcamp.methods.exercises;

//11. Implement a method "calculateSum"
// which accepts one argument (array of whole numbers)
// and returns the sum of
// those numbers.
// hint: you will have to loop trough
// array and sum all of the elements in
// it and then return the result.
public class Exercise11 {

    public static void main(String[] args) {
        int [] array = {3, 2, 4};
        int result = calculateSum(array);
        System.out.println("result is: " + result);

        System.out.println("result is: "
                + calculateSum(new int [] {5, 10, 20}));

        System.out.println("result is: " + calculateSum(new int [] {5, 10, 15}));

        System.out.println("result for empty array is: " + calculateSum(new int [] {}));
    }

    static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
          //  System.out.println("i: " + i);
          //  System.out.println("numbers[i]: " + numbers[i]);
            sum = sum + numbers[i];
            // or you can use this: sum += numbers[i];
           // System.out.println("sum: " + sum);
        }
      //  System.out.println("we will return this value: " + sum);
        return sum;
    }
}
