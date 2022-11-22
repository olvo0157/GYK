package com.gyk.java.oop.basics;

public class Account {
    private String id;
    private String name;
    private int balance=0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    int credit(int amount){
        balance+=amount;
        return balance;
    }
    int debit (int amount){
        if (amount<=balance){
            balance-=amount;
        } else {
            System.out.println("amount exceeded");
        }
        return balance;
    }
    int transferTo (Account another, int amount){
        if (amount<=balance){
            debit(amount);
            another.credit(amount);
        } else {
            System.out.println("amount exceeded");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account[" +
                "id=" + id +
                ", name=" + name +
                ", balance=" + balance +
                ']';
    }
}
