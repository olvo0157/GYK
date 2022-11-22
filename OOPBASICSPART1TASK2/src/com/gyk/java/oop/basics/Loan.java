package com.gyk.java.oop.basics;

import java.util.Date;

enum LoanType {
    LEASING("Leasing"), CONSUMER("Consumer");
    private String fullName;

    LoanType(String fullName) {
        this.fullName = fullName;
    }
    String displayLoanType()
    {
      return fullName;
    }
}
/*
enum ContractType {
    FULL_TIME("Full-Time"), PART_TIME("Part-Time");
    private String fullName;
    ContractType(String s) {
        fullName=s;
    }
    String getFullName(){return fullName;}
    ContractType() {
    }
};
 */
public class Loan {
    private String id;
    private double amount;
    private LoanType loanType;
    private Date terminationDate;

    public Loan() {
    }

    public Loan(String id, double amount, LoanType loanType, Date terminationDate) {
        this.id = id;
        this.amount = amount;
        this.loanType = loanType;
        this.terminationDate = terminationDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    public Date getTerminationDate() {
        return terminationDate;
    }

    public void setTerminationDate(Date terminationDate) {
        this.terminationDate = terminationDate;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id='" + id + '\'' +
                ", amount=" + amount +
                ", loanType=" + loanType.displayLoanType() +
                ", terminationDate=" + terminationDate +
                '}';
    }
}
