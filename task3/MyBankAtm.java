package com.gyk.java.oop.basics.task3;

public class MyBankAtm implements Atm {
    private double balance;

    public MyBankAtm(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(Card card, double amount) {
        try {

            if (amount > balance) {
                throw new InsufficientAtmFundsException("Insufficient ATM funds! Max available amount is: " + balance);
            }
            card.checkForSufficientFunds(amount);
            card.debit(amount);
            balance -= amount;
        } catch (InsufficientAtmFundsException exc) {
            exc.printStackTrace(new java.io.PrintStream(System.out));
        } catch (NotEnoughBalanceException exc) {
            exc.printStackTrace(new java.io.PrintStream(System.out));
        } catch (NotEnoughCreditException exc) {
            exc.printStackTrace(new java.io.PrintStream(System.out));
        }

    }

    @Override
    public void cashIn(Card card, double amount) {
        balance += amount;
        card.credit(amount);
    }
}
