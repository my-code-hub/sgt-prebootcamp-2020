package com.accenture.prebootcamp.lesson4.exercises;

//3) Which data type would you use to represent the following values?
//    a) Child age
//    b) Employee salary
//    c) Whether somebody has children or not
//    d) Apartment letter (single letter)
//    e) Title of a book
//
//    Create a program which declares and initializes all these
//    variables (any value you want) and outputs their
//    values. When naming variables, try to think of a good and
//    descriptive identifiers for those variables.
public class Exercise3 {

    public static void main(String[] args) {
        short childAge = 10;
        double employeeSalary = 500;
        boolean isChildless = false;
        char apartmentLetter = 'Z';
        String bookTitle = "Effective Java";

        System.out.println(childAge + "\n" +
                employeeSalary + "\n" +
                isChildless + "\n" +
                apartmentLetter + "\n" +
                bookTitle + "\n");
    }
}
