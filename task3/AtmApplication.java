package com.gyk.java.oop.basics.task3;

public class AtmApplication {
    public static void main(String[] args) {
        MyBankAtm myBankAtm = new MyBankAtm(5000);
        Card cardDebit = new DebitCard("JONAS JONAITIS", "40000000011", 70);
        Card cardCredit = new CreditCard("PETRAS PETRAITIS", "2000000001", 100, 2, 500);

        operations(myBankAtm, "-", cardDebit, 100.0);
        operations(myBankAtm, "+", cardDebit, 40.0);
        operations(myBankAtm, "-", cardDebit, 100.0);

        operations(myBankAtm, "-", cardCredit, 700.0);
        operations(myBankAtm, "+", cardCredit, 200.0);
        operations(myBankAtm, "-", cardCredit, 700.0);

        operations(myBankAtm, "-", cardCredit, 7000.0);

    }

    private static void operations(MyBankAtm myBankAtm, String operationType, Card card, Double amount) {
        if (operationType == "+") {
            System.out.println("Cash in operation: " + amount);
            myBankAtm.cashIn(card, 100);

        } else if (operationType == "-") {
            System.out.println("Withdraw operation: " + amount);
            myBankAtm.withdraw(card, amount);
        }
        System.out.println("ATM balance: " + myBankAtm.getBalance());
        System.out.println(card);
        System.out.println("-------------------------");
    }
}
