package com.accenture.prebootcamp.encapsulation.excersises.exercise2;

import java.util.Scanner;

public class ListManager {

    public static void main(String[] args) {
        MyList list = new MyList(20);
        Scanner scanner = new Scanner(System.in);
        do {
            //we ask user to input action
            System.out.println("What do you want to do? ");
            String input = scanner.nextLine();

            //we get first word from user input.
            String[] inputWords = input.split("\\s");
            String command = inputWords[0].toLowerCase().trim();
            switch (command) {
                case "exit":
                    System.out.println("bye...");
                    //stop the program by returning from main method
                    return;
                case "add":
                    list.add(input.substring(3).trim());
                    list.printList();
                    break;
                case "remove":
                    //get the index and convert it to int datatype
                    int index = Integer.parseInt(inputWords[1]);
                    //remove item from list and print the list
                    list.remove(index);
                    list.printList();
                    break;
                default:
                    System.out.println("Unsupported command!");
            }
        } while (true);
    }
}
