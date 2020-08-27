package com.accenture.prebootcamp.lesson11;

public class TwoDimensionalArrays {

    public static void main(String[] args) {
        //visual representation of this array:
        //https://cdn.journaldev.com/wp-content/uploads/2012/11/java-two-dimensional-array-diagram.png
        //read more - https://www.geeksforgeeks.org/multidimensional-arrays-in-java/

        //you can also think of the first dimension as rows and the second dimension as columns
        int[][] arrayOfArrays = new int[3][4];

        //update value of the "second row" and "third column"
        arrayOfArrays[1][2] = 100;

        //output value of the "second row" and "third column"
        //(as you can see updating and reading values work the same as in single dimension array.)
        System.out.println(arrayOfArrays[1][2]);

        System.out.println("************************");

        //nested loop example
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arrayOfArrays[i].length; j++) {
                System.out.println("i = " + i + ", j = " + j + ", arrayOfArrays[i][j] = " + arrayOfArrays[i][j]);
            }
        }

        System.out.println("************************");

        int [] secondRow = arrayOfArrays[1];
        System.out.println("secondRow[2] = " + secondRow[2]);
    }
}
