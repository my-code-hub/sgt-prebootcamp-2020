package com.accenture.prebootcamp.lesson9;

public class ArraysExamples {

    public static void main(String[] args) {
        int number = 5;
        int number2 = 10;
        System.out.println(number + " - " + number2);

        number = number2;
        System.out.println(number + " - " + number2);

        //declare array
        int[] myList;

        //create new array with size and assign reference of this array
        //to variable "myList"
        //Default value for all primitive data type numbers is 0
        myList = new int[10];

        //declare and initialize in a single statement.
        //This array contains non-primitive elements (String) and
        //the default value of each element is null
        String[] weekDays = new String[7];

        // another way to declare and initialize
        //  index nr. -   0  1  2
        int[] myList2 = {10, 5, 6};

        //examples of accessing elements in array
        System.out.println("myList2[0] (first element in myList2) " + myList2[0]);

        System.out.println("last element of myList2 - " + myList2[2]);

        //trying to access non-existing element (using wrong index)
        //System.out.println(myList2[3]);

        System.out.println("myList[5] - " + myList[5]);

        // updating element in array
        myList[5] = 25;
        System.out.println("myList[5] - " + myList[5]);


        System.out.println(" *********** ");
        //outputting all values in array with loop
        int[] myList3 = {110, 55, 50};
        System.out.println(myList3[0]);
        System.out.println(myList3[1]);
        System.out.println(myList3[2]);

        System.out.println(" *********** ");
        for (int i = 0; i < 3; i++) {
            System.out.println(myList3[i]);
        }
    }
}
