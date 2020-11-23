package com.accenture.prebootcamp.collections.example;

import com.accenture.prebootcamp.equals.examples.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples {

    public static void main(String[] args) {
        int[] numbersArray;

        ArrayList<Object> objectsList = new ArrayList<>();

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

        System.out.println("*************");
        List<Vehicle> vechicles = new ArrayList<>();
        vechicles.add(new Vehicle("1", "test", 12));
        vechicles.add(new Vehicle("2", "test", 12));

        int index = vechicles.indexOf(new Vehicle("2", "test", 12));
        int index2 = vechicles.indexOf(new Vehicle("3", "test", 12));
        System.out.println(index);
        System.out.println(index2);
    }

    static void printOutEverySecondElement(List<Vehicle> vehicles) {
        //...
    }
}
