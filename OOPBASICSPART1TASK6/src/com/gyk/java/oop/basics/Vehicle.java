package com.gyk.java.oop.basics;

public class Vehicle {
    private String name;
    private String brand;
    private double fuel;
    private double consumption;

    public Vehicle() {
    }

    public Vehicle(String name, String brand, double fuel, double consumption) {
        this.name = name;
        this.brand = brand;
        this.fuel = fuel;
        this.consumption = consumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }
}