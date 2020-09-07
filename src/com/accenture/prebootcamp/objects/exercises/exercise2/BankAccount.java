package com.accenture.prebootcamp.objects.exercises.exercise2;

//create a class "BankAccount"..
public class BankAccount {

    //..with property "balance" (should be decimal number)
    double balance;

    //* create empty default constructor for it
    public BankAccount() {
    }

    //* create a constructor with parameter for setting balance.
    public BankAccount(double balance) {
        this.balance = balance;
    }

    double deposit(double amount) {
        balance += amount;
        return balance;
    }

    double withdraw(double amount) {
        balance -= amount;
        return balance;
    }

    void printBalance() {
        System.out.println("balance is " + balance);
    }

    void transferFrom(BankAccount other, double amount) {
        this.balance += amount;
        other.balance -= amount;
    }
}
