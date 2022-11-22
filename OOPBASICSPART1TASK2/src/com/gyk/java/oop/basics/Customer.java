package com.gyk.java.oop.basics;

import java.util.Arrays;

public class Customer {
    private String name;
    private String surname;
    private int age;
    private String personalNumber;
    private Loan[] loans;

    public double totalLoansAmount() {
        double total = 0.0;
        for (Loan loan : loans
        ) {
            total += loan.getAmount();
        }
        return total;
    }

    public Customer() {}

    public Customer(String name, String surname, int age, String personalNumber, Loan[] loans) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.personalNumber = personalNumber;
        this.loans = loans;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    public Loan[] getLoans() {
        return loans;
    }

    public void setLoans(Loan[] loans) {
        this.loans = loans;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", personalNumber='" + personalNumber + '\'' +
                ", loans=" + Arrays.toString(loans) +
                '}';
    }
}
