package com.accenture.prebootcamp.lesson8;

public class SwitchExamples {

    public static void main(String[] args) {
        int number = 1;
        switch (number) {
            case 1:
                System.out.println("Number is one!");
                break;
            case 2:
                System.out.println("Number is two!");
                break;
            case 7:
                System.out.println("Seven!");
                break;
            default:
                System.out.println("Default block!");
        }

        String text = "A";
        switch (text) {
            case "A":
                System.out.println("Best grade!");
                break;
            case "B":
                System.out.println("Case B");
                break;
            default:
                System.out.println("Default");
        }
    }
}
