package com.accenture.prebootcamp.lesson5.exercises;

//14) Write a Java program to print the area and perimeter of a rectangle.
//    Declare variables width and height,
//    assign them values 5.6 and 8.5. Then calculate area and perimeter
//    and assign those values to new variables.
//    Print out the variables which contain area and perimeter.
//    Test Data:
//        Width = 5.6 Height = 8.5
//
//    Expected Output:
//        Area is 5.6 * 8.5 = 47.60
//        Perimeter is 2 * (5.6 + 8.5) = 28.20
public class Exercise14 {

    public static void main(String[] args) {
        double width = 5.6;
        double height = 8.5;

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("Area is " + width + " * " + height + " = " + area);
        System.out.println("Perimeter is 2 * (" +
                width + " + " + height + ") = " + perimeter);
    }
}
