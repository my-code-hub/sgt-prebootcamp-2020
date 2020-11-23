package com.accenture.prebootcamp.lesson5.exercises;

//11) In the following program, explain why the value "6" is printed
// twice in a row:
//    class PrePostDemo {
//        public static void main(String[] args){
//            int i = 3;
//            i++;
//            System.out.println(i);    // "4"
//            ++i;
//            System.out.println(i);    // "5"
//            System.out.println(++i);  // "6"
//            System.out.println(i++);  // "6"
//            System.out.println(i);    // "7"
//        }
//    }
public class Exercise11 {

    public static void main(String[] args) {
        int i = 3;
        i++;
        System.out.println(i);    // "4"
        ++i;
        System.out.println(i);    // "5"
        System.out.println(++i);  // "6"
        System.out.println(i++);  // "6"
        System.out.println(i);    // "7"

        int number = i++;
        System.out.println("number: " + number);
        System.out.println("i: " + i);
    }
}
