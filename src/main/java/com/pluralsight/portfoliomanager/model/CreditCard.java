package com.pluralsight.portfoliomanager.model;

import java.math.BigDecimal;

// A credit card's balance is how much you owe.
public class CreditCard extends Account {

    public CreditCard(int accountNumber, String name, BigDecimal balance) {
        super(accountNumber, name, balance);
    }

    public void charge(BigDecimal amount) {
        // TODO: a charge adds to what you owe
//        maybe use getBalance?
//        does charge mean that it takes away from the deposit method? Maybe from the getBalance method
        BigDecimal addOwe = getBalance().add(amount);
        setBalance(addOwe);

    }

    public void pay(BigDecimal amount) {
        // TODO: a payment takes away from what you owe
        BigDecimal addOwe = getBalance().subtract(amount);
        setBalance(addOwe);
    }

    // TODO: override getValue(). Money you owe is worth less than nothing,
    //       so a credit card's value is its balance as a negative number.
    @Override
    public BigDecimal getValue() {
        //return balance as a negative
       BigDecimal negative= getBalance().negate();
       //if i put setbalance here it would "mutate" the get balance since it overwrites whatever logic is here.
        // Calling getbalance is enough because we operate on it with the variable negative and return negative so theres no need to call setBalance
        //"Your logic is mostly right, with one small precision tweak on what gets mutated: calling setBalance(...) inside getValue()
        // mutates the stored balance field on the object (which future calls to getBalance() read from), rather than mutating the
        // getBalance() method itself. Calling getBalance(), computing negative, and returning negative is completely enough here
        // because getValue() only needs to report a value—not change the object's saved state."
        return negative;
    }
}
