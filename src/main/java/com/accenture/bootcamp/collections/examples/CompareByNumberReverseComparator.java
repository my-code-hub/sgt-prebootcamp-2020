package com.accenture.bootcamp.collections.examples;

import java.util.Comparator;

// Comparable vs Comparator
// https://www.geeksforgeeks.org/comparable-vs-comparator-in-java/
public class CompareByNumberReverseComparator implements Comparator<SortedObject> {

    //Note: This is not NPE prone. If number or text property will be null
    //this comparator will fail with NullPointerException
    @Override
    public int compare(SortedObject o1, SortedObject o2) {
        return Integer.compare(o2.getNumber(), o1.getNumber());
    }
}
