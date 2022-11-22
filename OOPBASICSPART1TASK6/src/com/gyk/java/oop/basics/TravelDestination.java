package com.gyk.java.oop.basics;

public class TravelDestination {
    private String name;
    private String city;
    private int distance;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TravelDestination that = (TravelDestination) o;
        return distance == that.distance && name.equals(that.name) && city.equals(that.city);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public TravelDestination() {
    }

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
}
