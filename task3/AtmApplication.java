package com.gyk.java.oop.basics.task3;

public class AtmApplication {
    public static void main(String[] args) {
        MyBankAtm myBankAtm = new MyBankAtm(5000);
        Card cardDebit = new DebitCard("JONAS JONAITIS", "40000000011", 70);
        Card cardCredit = new CreditCard("PETRAS PETRAITIS", "2000000001", 100, 2, 500);
        System.out.println("Trying to withdraw 100 eur from debit card");
        myBankAtm.withdraw(cardDebit, 100);
        System.out.println("ATM balance: " + myBankAtm.getBalance());
        System.out.println(cardDebit);
        System.out.println("-------------------------");
        System.out.println("Cash in 40 eur to debit card");
        myBankAtm.cashIn(cardDebit, 40);
        System.out.println("ATM balance: " + myBankAtm.getBalance());
        System.out.println(cardDebit);
        System.out.println("-------------------------");
        System.out.println("Trying to withdraw 100 eur from debit card");
        myBankAtm.withdraw(cardDebit, 100);
        System.out.println("ATM balance: " + myBankAtm.getBalance());
        System.out.println(cardDebit);
        System.out.println("-------------------------");
        System.out.println("Trying to withdraw 700 eur from credit card");
        myBankAtm.withdraw(cardCredit, 700);
        System.out.println("ATM balance: " + myBankAtm.getBalance());
        System.out.println(cardCredit);
        System.out.println("-------------------------");
        System.out.println("Cash in 200 eur to credit card");
        myBankAtm.cashIn(cardCredit, 200);
        System.out.println("ATM balance: " + myBankAtm.getBalance());
        System.out.println(cardCredit);
        System.out.println("-------------------------");
        System.out.println("Trying to withdraw 700 eur from credit card");
        myBankAtm.withdraw(cardCredit, 700);
        System.out.println("ATM balance: " + myBankAtm.getBalance());
        System.out.println(cardCredit);
        System.out.println("-------------------------");
        System.out.println("Trying to withdraw 7000 eur from credit card");
        myBankAtm.withdraw(cardCredit, 7000);
        System.out.println("ATM balance: " + myBankAtm.getBalance());
    }
}
