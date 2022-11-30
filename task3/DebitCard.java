package com.gyk.java.oop.basics.task3;

public class DebitCard extends Card {
    public DebitCard(String cardHolder, String cardNumber, double balance) {
        super(cardHolder, cardNumber, balance);
    }

    public DebitCard() {
    }

    @Override
    void checkForSufficientFunds(double amount) throws NotEnoughBalanceException {
        if (amount > getBalance()) {
            throw new NotEnoughBalanceException("Insufficient funds! Max available amount is: " + getBalance());
        }
    }
}
