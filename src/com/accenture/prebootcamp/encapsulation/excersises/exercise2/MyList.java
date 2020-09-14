package com.accenture.prebootcamp.encapsulation.excersises.exercise2;

//E.2. Create class "MyList".
public class MyList {

    //Add property "list" which is of type array with text elements.
    private String[] list;

    //1. Create default constructor which
    // initializes "list" to a new empty array of size 3.
    MyList() {
        list = new String[3];
    }

    //2. Create another constructor which
    // has one parameter "size" (whole number) and
    // use this variable to create new empty
    // array of that size and assign it to "list"
    MyList(int size) {
        //TODO
    }

    //4. Create method "add" for adding element to the list.
    // (this method should be accessible publicly)
    public void add(String element) {
        //here we have to loop trough array
        // and add new element at the first empty spot.
        //(loop trough array and at "element" to the first empty slot)
    }

    public void printList() {
        //5. Create method "printList" which outputs the list.
        // (only accessible on package level)
        // just loop trough array and print out all of the values
    }

}
