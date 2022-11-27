package com.gyk.java.oop.basics.task3;

public abstract class Card extends Exception {
    private String cardHolder;
    private String cardNumber;
    private double balance;

    public Card() {
    }

    public Card(String cardHolder, String cardNumber, double balance) {
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    abstract void checkForSufficientFunds(double amount) throws NotEnoughBalanceException, NotEnoughCreditException;

    public void credit(double amount) {
        balance += amount;
    }

    public void debit(double amount) {
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardHolder='" + cardHolder + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public String getCardNumber() {
        return cardNumber;
    }
}
