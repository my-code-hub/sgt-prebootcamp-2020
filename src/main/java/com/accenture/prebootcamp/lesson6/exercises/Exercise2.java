package com.accenture.prebootcamp.lesson6.exercises;

import java.util.Scanner;

//2) Write a Java program that reads a number in inches, converts it to meters.
//   Note: One inch is 0.0254 meter.
//       Test Data
//            Input a value for inch: 1000
//       Expected Output :
//            1000.0 inch is 25.4 meters
public class Exercise2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double inchesToMetersMultiplier = 0.0254;

        System.out.print("Please enter length in inches: ");
        double inches = input.nextDouble();

        double lengthMeters = inches * inchesToMetersMultiplier;
        System.out.println(inches + " inch is " + lengthMeters + " meters");

        input.close();
    }
}
