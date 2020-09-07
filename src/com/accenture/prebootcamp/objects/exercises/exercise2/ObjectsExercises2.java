package com.accenture.prebootcamp.objects.exercises.exercise2;

public class ObjectsExercises2 {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(100);
        account1.printBalance();

        account1.withdraw(20);
        account1.printBalance();

        account1.deposit(10);
        account1.printBalance();

        BankAccount account2 = new BankAccount();
        account2.printBalance();
        account2.deposit(200);
        account2.printBalance();

        account1.transferFrom(account2, 50.00);

        account1.printBalance();
        account2.printBalance();

//        account1.withdraw(1000);
//        account1.printBalance();
//
        //doesn't compile, because "balance" property is
        //encapsulated (set to private)
//        account1.balance = 100000;

        double balance1 = account1.getBalance();
        System.out.println("balance1 = " + balance1);

    }
}
