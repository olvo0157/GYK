package com.gyk.java.oop.basics;

import java.util.Objects;

public class TravelDestination {
    private String name;
    private String city;
    private int distance;


    public TravelDestination(String name, String city, int distance) {
        this.name = name;
        this.city = city;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TravelDestination)) return false;
        TravelDestination that = (TravelDestination) o;
        return getDistance() == that.getDistance() && getName().equals(that.getName()) && getCity().equals(that.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCity(), getDistance());
    }
}
