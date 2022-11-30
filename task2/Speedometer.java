package com.gyk.java.oop.basics.task2;

public class Speedometer {
    public static Bike chooseWinner(MountainBike mountainBike, RoadBike roadBike) {
        return chooseWinner(mountainBike.getSpeed(), roadBike.getSpeed());
    }

    public static Bike chooseWinner(int mountainBikeSpeed, int roadBikeSpeed) {
        Bike winner;
        if (mountainBikeSpeed > roadBikeSpeed) {
            winner = Bike.MOUNTAIN;
        } else if (mountainBikeSpeed < roadBikeSpeed) {
            winner = Bike.ROAD;
        } else {
            winner = Bike.NONE;
        }
        return winner;
    }
}
