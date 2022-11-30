package com.gyk.java.oop.basics.task2;

public class RoadBike implements Bicycle {
    private int gear;
    private int speed;

    public RoadBike() {
    }

    public RoadBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "RoadBike{" +
                "gear=" + gear +
                ", speed=" + speed +
                '}';
    }

    @Override
    public void changeGear(int newGear) {

        if (newGear != -1 && newGear != 1 && newGear != -2 && newGear != 2) {
            String recommendGear;
            if (newGear > 2) {
                recommendGear = "2";
            } else if (newGear < -2) {
                recommendGear = "-2";

            } else {
                recommendGear = "-1 or 1";

            }
            System.out.println(newGear + " value is not allowed for road bike. Please use " + recommendGear);
        } else if (gear + newGear < 0 || gear + newGear > 10) {
            System.out.println("Gear breaks the limits of road bike'. It is either over the max 10 or below 0.");
        } else {
            gear += newGear;
            System.out.println("Current road bike' gear: " + gear);
        }
    }

    @Override
    public void speedUp(int increment) {

        if (increment < 0) {
            System.out.println("Value cannot be negative for road bike. Please use positive number.");
        } else if (speed + increment > 50) {
            System.out.println("Speed is too high for road bike. The highest possible increment is: " + (50 - speed));
        } else {
            speed += increment;
            System.out.println("Current speed: " + speed);
        }


    }

    @Override
    public void applyBrakes(int brakingValue) {
        if (brakingValue > 0) {
            System.out.println("Braking value cannot be positive for road bike. Please use negative number.");
        } else if (speed - brakingValue < 0) {
            System.out.println("Speed cannot be negative for road bike");
        } else {
            speed += brakingValue;
            System.out.println("Current speed of road bike': " + speed);
        }

    }
}
