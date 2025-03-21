package org.example;
public class Application {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 1000);
        account.deposit(500);
        account.deposit(-500);
        account.withdraw(200);
        account.withdraw(-200);
        account.withdraw(2000);
    }
}