package com.gyk.java.oop.basics.task2;

public class BicycleApplication {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(1, 30);
        RoadBike roadBike = new RoadBike(1, 30);
        System.out.println("The winner is: " + Speedometer.chooseWinner(mountainBike, roadBike));
        int[] gears = {-2, -1, 1, 2, 1, 1};
        int previuosGear;
        for (int gear : gears) {
            System.out.println("---------------------------------------");
            previuosGear = mountainBike.getGear();
            mountainBike.changeGear(gear);
            if (previuosGear != mountainBike.getGear()) {
                if (gear > 0) {
                    mountainBike.speedUp(gear * 5);
                } else {
                    mountainBike.applyBrakes(gear * 2);
                }
            }

            previuosGear = roadBike.getGear();
            roadBike.changeGear(gear);
            if (previuosGear != roadBike.getGear()) {
                if (gear > 0) {
                    roadBike.speedUp(gear * 6);
                } else {
                    roadBike.applyBrakes(gear * 2);
                }
            }
            System.out.println("The winner is: " + Speedometer.chooseWinner(mountainBike, roadBike));
        }

    }
}
