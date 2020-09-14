package com.accenture.prebootcamp.encapsulation.excersises.exercise2;

//   6. Create class "ListProgram" which:
//        1. Creates a new instance of "MyList" with default constructor
//        2. Add two elements to your list (any values)
//        3. Output all of the values in your list
//        4. Create another list. This time specify size 5.
//        5. Add 4 elements to this list
//        6. Output all of the values in your list
public class ListProgram {

    public static void main(String[] args) {
        // 1. Creates a new instance of "MyList" with default constructor
        MyList list1 = new MyList();

        //2. Add two elements to your list (any values)
        list1.add("Apple");
        list1.add("Orange");

        //3. Output all of the values in your list
        list1.printList();

        System.out.println(" ****************** ");

        //4. Create another list. This time specify size 5.
        MyList list2 = new MyList(5);

        //5. Add 4 elements to this list
        list2.add("Apple");
        list2.add("Orange");
        list2.add("Banana");
        list2.add("Coconut");
        list2.printList();
    }
}
