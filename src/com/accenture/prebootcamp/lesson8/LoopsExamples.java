package com.accenture.prebootcamp.lesson8;

public class LoopsExamples {

    //https://www.tutorialspoint.com/java/java_loop_control.htm
    public static void main(String[] args) {
        int x = 0;

        //while loop example
        while (x < 10) {
            System.out.println("value of x : " + x);
            x++;
        }

        System.out.println("**********************");

        //do while loop example
        x = 0;
        do {
            System.out.println("value of x : " + x);
            x++;
        } while (x < 10);

        System.out.println("**********************");
        //for loop example
        for (int i = 0; i < 10; i++) {
            System.out.println("value of i: " + i);
        }

        System.out.println("*********** break and continue example ***********");
        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                System.out.println("Stop running remaining code and start from beginning");
                continue;
            }
            System.out.println("value of i: " + i);
            if (i == 5) {
                System.out.println("jumping out of loop with break;");
                break;
            }
        }
    }
}
