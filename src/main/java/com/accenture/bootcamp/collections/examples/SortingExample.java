package com.accenture.bootcamp.collections.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingExample {

    public static void main(String[] args) {
        SortedObject o1 = new SortedObject(-1, "Z");
        SortedObject o2 = new SortedObject(3, "A");
        System.out.println(o1.compareTo(o2));
        System.out.println(o2.compareTo(o1));

        List<SortedObject> list = new ArrayList<>();

        list.add(new SortedObject(2, "A"));
        list.add(new SortedObject(3, "B"));
        list.add(new SortedObject(1, "B"));
        list.add(new SortedObject(3, "A"));
        list.add(new SortedObject(-1, "Z"));

        for (SortedObject item : list) {
            System.out.println(item);
        }

        //sorting by natural order
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
