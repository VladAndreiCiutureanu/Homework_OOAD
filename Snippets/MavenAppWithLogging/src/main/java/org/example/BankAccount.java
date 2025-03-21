package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {
    private static final Logger logger = LoggerFactory.getLogger(BankAccount.class);

    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if(amount <= 0){
            logger.error("Owner: " + owner + " tried to deposit a negative amount");
            return;
        }
        balance += amount;
        logger.info("Deposited " + amount + " to " + owner + "'s account");
    }

    public void withdraw(double amount) {
        if(amount <= 0){
            logger.error("Owner: " + owner + " tried to withdraw a negative amount");
            return;
        }
        if(balance < amount){
            logger.error("Owner: " + owner + " tried to withdraw more than the balance");
            return;
        }
        balance -= amount;
        logger.info("Withdrew " + amount + " from " + owner + "'s account");
    }
}
