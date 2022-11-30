package com.gyk.java.oop.basics.task3;

public interface Atm {
    void withdraw(Card card, double amount);

    void cashIn(Card card, double amount);
}
