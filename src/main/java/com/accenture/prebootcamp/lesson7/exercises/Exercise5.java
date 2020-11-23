package com.accenture.prebootcamp.lesson7.exercises;

import java.util.Scanner;

//5. Write a Java program to calculate the revenue from a sale based on the unit price and quantity of a product input by
// the user. The discount rate is 10% if the quantity purchased is between 100 and 120 units, and 15% for the quantity
// greater than 120 units. If the quantity purchased is less than 100 units, the discount rate is 0%. See the 3
// examples below:
//   Example 1:
//     Input:
//        Enter unit price: 25
//        Enter quantity: 110
//     Output:
//        The revenue from sale: 2475.0 EUR
//        Discount: 275.0 EUR (10.0%)
//
//   Example 2:
//     Input:
//         Enter unit price: 25
//         Enter quantity: 99
//      Output:
//         The revenue from sale: 2475.0 EUR
//         Discount: 0.0 EUR (0.0%)
//
//   Example 3:
//     Input:
//         Enter unit price: 25
//         Enter quantity: 121
//     Output:
//         The revenue from sale: 2571,25 EUR
//         Discount: 453,75 EUR (15.0%)
public class Exercise5 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        double unitPrice = userInput.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = userInput.nextInt();

        double discountRate = 0;
        if (quantity > 120) {
            discountRate = 0.15;
        } else if (quantity >= 100) {
            discountRate = 0.10;
        }

        double revenue = unitPrice * quantity;
        double discount = revenue * discountRate;
        double discountRevenue = revenue - discount;

        System.out.println("The revenue from sale: " + discountRevenue + " EUR");
        System.out.println("Discount: " + discount + " EUR (" + (discountRate * 100d) + "%)");

        userInput.close();
    }
}
