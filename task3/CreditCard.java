package com.gyk.java.oop.basics.task3;

public class CreditCard extends Card {
    private double interest;
    private final double credit;

    public CreditCard(String cardHolder, String cardNumber, double balance, double interest, double credit) {
        super(cardHolder, cardNumber, balance);
        this.interest = interest;
        this.credit = credit;
    }

    @Override
    void checkForSufficientFunds(double amount) throws NotEnoughCreditException {
        if (amount > getMaxAvailableAmount()) {
            throw new NotEnoughCreditException("Insufficient funds! Max available amount is: " + getMaxAvailableAmount());
        }
    }

    @Override
    public void debit(double amount) {
        super.debit(amount * (1 + interest / 100));

    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardHolder='" + super.getCardHolder() + '\'' +
                ", cardNumber='" + super.getCardNumber() + '\'' +
                ", balance=" + super.getBalance() +
                ", interest=" + interest +
                ", credit=" + credit +
                "} ";
    }

    private double getMaxAvailableAmount() {
        return Math.floor((getBalance() + credit) / (1 + interest / 100));

    }
}
