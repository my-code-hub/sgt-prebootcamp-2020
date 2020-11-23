package com.accenture.prebootcamp.lesson8.exercises;

import java.util.Scanner;

//1) Write a program that asks user to input number and prints out the name of the corresponding day.
//   If user inputs any other number than 1 - 7, then print out "There is no such day, please enter numbers 1 - 7!"
//   You have to use switch / case statements. You can't use if / else.
//    example 1:
//        Input: 1
//        Output: Monday
//    example 2:
//        Input: 7
//        Output: Sunday
public class Exercise1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input day of the week: ");
        int dayOfWeek = input.nextInt();

        String dayOfWeekText = null;
        switch (dayOfWeek) {
            case 1:
                dayOfWeekText = "Monday";
                break;
            case 2:
                dayOfWeekText = "Tuesday";
                break;
            case 3:
                dayOfWeekText = "Wednesday";
                break;
            case 4:
                dayOfWeekText = "Thursday";
                break;
            case 5:
                dayOfWeekText = "Friday";
                break;
            case 6:
                dayOfWeekText = "Saturday";
                break;
            case 7:
                dayOfWeekText = "Sunday";
                break;
            default:
                System.out.println("There is no such day, please enter numbers 1 - 7!");
        }
        if (dayOfWeekText != null) {
            System.out.println("Today is " + dayOfWeekText);
        }

        /*************************************************************************************************************/
        //another way, we could move it out in a method;
        String dayOfWeekStr = getDayOfWeek(dayOfWeek);
        String message;
        if (dayOfWeekStr != null) {
            message = "Today is " + dayOfWeekText;
        } else {
            message = "There is no such day, please enter numbers 1 - 7!";
        }
        System.out.println(message);

        input.close();
    }

    static String getDayOfWeek(int dayOfWeek) {
        switch (dayOfWeek) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: return null;
        }
    }
}
