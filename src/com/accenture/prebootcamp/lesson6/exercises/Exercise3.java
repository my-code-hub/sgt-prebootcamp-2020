package com.accenture.prebootcamp.lesson6.exercises;

import java.util.Scanner;

//3) Ask user to input three words and put them in this sentence:
//    Example:
//       Please input your name: John
//       Please input your job title: Programmer
//       Please input your age: 60
//
//    Expected output:
//    "Hello, my name is John and I'm Programmer. I'm 60 years old."
public class Exercise3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please input your name: ");
        String name = input.nextLine();

        System.out.print("Please input your job title: ");
        String jobTitle = input.nextLine();

        System.out.print("Please input your age: ");
        int age = input.nextInt();

        System.out.println("Hello, my name is " + name + " and I'm " + jobTitle +
                ". I'm " + age + " years old.");

        input.close();
    }
}
