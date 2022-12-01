package com.gyk.java.oop.basics;

import java.util.Arrays;

public class Family {
    private Person[] persons;
    private Vehicle vehicle;
    private TravelDestination travelDestination;

    public Family(Person[] persons, Vehicle vehicle, TravelDestination travelDestination) {
        this.persons = persons;
        this.vehicle = vehicle;
        this.travelDestination = travelDestination;
    }

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public TravelDestination getTravelDestination() {
        return travelDestination;
    }

    public void setTravelDestination(TravelDestination travelDestination) {
        this.travelDestination = travelDestination;
    }

    @Override
    public String toString() {
        return Arrays.toString(persons);
    }
}
