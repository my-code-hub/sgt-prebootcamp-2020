package com.accenture.bootcamp.collections.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingExample {

    public static void main(String[] args) {
        List<SortedObject> list = new ArrayList<>();

        list.add(new SortedObject(1, "B"));
        list.add(new SortedObject(2, "A"));
        list.add(new SortedObject(3, "B"));
        list.add(new SortedObject(3, "A"));
        list.add(new SortedObject(-1, "Z"));

        for (SortedObject item : list) {
            System.out.println(item);
        }

        Collections.sort(list);

        System.out.println(" \n*****************\n ");

        for (SortedObject item : list) {
            System.out.println(item);
        }

        System.out.println(" \n******** CompareByNumberReverseComparator *********\n ");
        //Sort the list using differen comparator
        list.sort(new CompareByNumberReverseComparator());

        for (SortedObject item : list) {
            System.out.println(item);
        }
    }
}
