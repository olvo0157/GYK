package com.gyk.java.oop.basics;

import java.sql.Date;

public class LoanApplication {
    public static void main(String[] args) {
        Customer customer=new Customer("Vardenis", "Pavardenis", 30, "38001010001", null);
        Loan[] loans = new Loan[2];
        loans[0] = new Loan("Nr1", 5000, LoanType.LEASING, Date.valueOf("2024-02-01"));
        loans[1] = new Loan("Nr2", 2000, LoanType.CONSUMER, Date.valueOf("2023-02-15"));
        customer.setLoans(loans);
        System.out.println(customer +" Total amount: "+customer.totalLoansAmount());
    }
}
