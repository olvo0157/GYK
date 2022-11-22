package com.gyk.java.oop.basics;

import java.util.Date;

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

public class Employee {
    private String name;
    private String surname;
    private ContractType contract;
    private Date contractStartDate;
    private Float salary;
    private String position;
/*public String getContractTypeString(ContractType par){
    for (ContractType type: ContractType.values()
         ) {


    }

    return "";
}
*/
    public ContractType getContract() {
        return contract;
    }

    public void setContract(ContractType contract) {
            this.contract = contract;
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

    public Date getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(Date contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", contract='" + contract.getFullName() + '\'' +
                ", contractStartDate=" + contractStartDate +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }
}
/*
+•	Create a package: com.gyk.java.oop.basics
       + •	Create a class: Employee which has fields: name, surname, contract type(Full-Time, Part-Time), contract start date, salary and position.
       + •	Create a class EmployeeManager which has main method.
        •	Create an Employee object in EmployeeManager. Fill out all fields with data.
        •	Print all employee information.

        Requirements:
        •	Employee should have constructors (with-args, without-args).
        + (private, get+set)•	Use encapsulation.
        •	Use enum where it‘s needed (enum constants must have display values and a method to create enum from display value).
        •	To print out all information create method in Employee class and call it from EmployeeManager.
         
*/