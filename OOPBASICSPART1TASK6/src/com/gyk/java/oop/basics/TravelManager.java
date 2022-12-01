package com.gyk.java.oop.basics;

public class TravelManager {
    public static Family changeDestination(Family family, TravelDestination destination) {
        if (family.getTravelDestination().equals(destination)) {
            System.out.println("Nothing to change");
        } else {
            family.setTravelDestination(destination);
        }
        return family;
    }

    public static void travel(Family family) {
        double availableDistance = getAvailableDistance(family);
        double distanceDifference = getAvailableDistance(family) - family.getTravelDestination().getDistance();
        if (distanceDifference >= 0) {
            System.out.println("Family is able to travel to their destination");
        } else {
            double fuelToBuy = Math.abs(distanceDifference) * family.getVehicle().getConsumption() / 100;
            System.out.println("Family is not able to travel to their destination. They need  at least " + fuelToBuy + " of fuel.");
        }
    }

    public static void printFamilyMembers(Family family) {
        System.out.println(family);
    }

    private static double getAvailableDistance(Family family) {
        return family.getVehicle().getFuel() / family.getVehicle().getConsumption() * 100;

    }
}
