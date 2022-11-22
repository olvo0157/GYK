package com.gyk.java.oop.basics;

import java.sql.Date;

public class EmployeeManager {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Vardenis");
        employee.setSurname("Pavardenis");
        employee.setContractStartDate(Date.valueOf("2022-02-01"));
        employee.setPosition("testuotojas");
        employee.setSalary(1000F);
        employee.setContract(ContractType.FULL_TIME);
        System.out.println(employee);
    }
}


/*
+•	Create a package: com.gyk.java.oop.basics
        •	Create a class EmployeeManager which has main method.
        •	Create an Employee object in EmployeeManager. Fill out all fields with data.
        •	Print all employee information.
        Requirements:
        •	To print out all information create method in Employee class and call it from EmployeeManager.
         
*/