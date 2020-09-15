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
                case "printlist":
                    list.printList();
                    break;
                case "add":
                    list.add(input.substring(3).trim());
                    list.printList();
                    break;
                case "edit":
                    String editIndexStr = inputWords[1];
                    int editIndex = Integer.parseInt(editIndexStr);
                    //replace the "edit" and "index" part of the input with empty string,
                    //so we get rest of the text. It would be easier/better to do this with regular
                    //expressions, but we haven't learned them yet.
                    String element = input.replaceFirst(command, "")
                            .replaceFirst(editIndexStr, "")
                            .trim();
                    list.edit(editIndex, element);
                    list.printList();
                    break;
                case "remove":
                    //get the index and convert it to int datatype
                    int index = Integer.parseInt(inputWords[1]);
                    //remove item from list and print the list
                    list.remove(index);
                    list.printList();
                    break;
                case "exit":
                    System.out.println("bye...");
                    //stop the program by returning from main method
                    return;
                default:
                    System.out.println("Unsupported command!");
            }
        } while (true);
    }
}
