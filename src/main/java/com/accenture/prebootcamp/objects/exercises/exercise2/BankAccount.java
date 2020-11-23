package com.accenture.prebootcamp.objects.exercises.exercise2;

//create a class "BankAccount"..
public class BankAccount {

    static final double MAX_DEPOSIT = 5000d;

    //..with property "balance" (should be decimal number)
    private double balance;

    //* create empty default constructor for it
    BankAccount() {
    }

    //* create a constructor with parameter for setting balance.
    BankAccount(double balance) {
        this.balance = balance;
    }

    double getBalance() {
        return balance;
    }

    double deposit(double amount) {
        if (amount <= MAX_DEPOSIT) {
            balance += amount;
        } else {
            System.out.println("Transaction cancelled. Max deposit - " + MAX_DEPOSIT  +
                    " | Your deposit: " + amount);
        }
        return balance;
    }

    double withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("There is not enough funds.");
        }
        return balance;
    }

    void printBalance() {
        System.out.println("balance is " + balance);
    }

    void transferFrom(BankAccount other, double amount) {
        if (other.balance >= amount) {
            this.balance += amount;
            other.balance -= amount;
        } else {
            System.out.println("Transfer cancelled. You are trying to transfer " + amount +
                    " units, but only " + other.balance + " are available.");
        }
    }
}
