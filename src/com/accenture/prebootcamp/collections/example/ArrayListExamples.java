package com.accenture.prebootcamp.collections.example;

import java.util.ArrayList;

public class ArrayListExamples {

    public static void main(String[] args) {
        int[] numbersArray;

        // we created a new array list. At the moment
        // this array list is empty
        ArrayList<String> myFirstArray;
        myFirstArray = new ArrayList<>();

        //add two elements
        myFirstArray.add("Apple");
        myFirstArray.add("Coconut");
        myFirstArray.add("Orange");

        for (String element : myFirstArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println("myFirstArray.size(): " + myFirstArray.size());

        myFirstArray.remove("Coconut");
        System.out.println("myFirstArray.size(): " + myFirstArray.size());

        myFirstArray.remove(0);
        for (String element : myFirstArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        myFirstArray.set(0, "Red apple");
        System.out.println("myFirstArray.get(0) " + myFirstArray.get(0));
    }
}
