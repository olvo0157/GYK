package com.gyk.java.oop.basics;

public class AccountApplication {
    public static void main(String[] args) {
        AccountManagerApplication accounts= new AccountManagerApplication();
        accounts.account1.credit(20);
        accounts.account1.credit(10);
        System.out.println("Balance: "+accounts.account1.getBalance());
        accounts.account2.credit(10);
        System.out.println("Balance: "+accounts.account2.getBalance());
        accounts.account1.debit(500);
        accounts.account2.transferTo(accounts.account1,70);
        accounts.account1.debit(30);
        System.out.println("Balance: "+accounts.account1.getBalance());
        accounts.account1.transferTo(accounts.account2,10);
        System.out.println("Balance: "+accounts.account1.getBalance());
        System.out.println("Balance: "+accounts.account2.getBalance());
        System.out.println(accounts.account1);
        System.out.println(accounts.account2);

    }
}
