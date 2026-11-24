package com.pluralsight.portfoliomanager.model;

import java.math.BigDecimal;

public class BankAccount extends Account {

    public BankAccount(int accountNumber, String name, BigDecimal balance) {
        super(accountNumber, name, balance);
    }

    public void deposit(BigDecimal amount) {
        // TODO: add the amount to the balance
        //what I want to do is add the amount to the balance
        BigDecimal add = getBalance().add(amount);
        setBalance(add);
    }

    public void withdraw(BigDecimal amount) {
        // TODO: take the amount out of the balance
        BigDecimal subtract = getBalance().subtract(amount);
        setBalance(subtract);
    }
}
