package com.gyk.java.oop.basics.task2;

public class MountainBike implements Bicycle {
    private int gear;
    private int speed;

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

    public MountainBike() {
    }

    public MountainBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "MountainBike{" +
                "gear=" + gear +
                ", speed=" + speed +
                '}';
    }

    @Override
    public void changeGear(int newGear) {
        if (newGear != -1 && newGear != 1) {
            System.out.println(newGear + " value is not allowed for mountain bike. Please use 1 or -1");
        } else if (gear + newGear < 0 || gear + newGear > 20) {
            System.out.println("Gear breaks the mountain bike' limits. It is either over the max 20 or below 0.");
        } else {
            gear += newGear;
            System.out.println("Current mountain bike' gear: " + gear);
        }
    }

    @Override
    public void speedUp(int increment) {

        if (increment < 0) {
            System.out.println("Value cannot be negative for mountain bike. Please use positive number.");
        } else if (speed + increment > 100) {
            System.out.println("Speed is too high for mountain bike. The highest possible increment is: " + (100 - speed));
        } else {
            speed += increment;
            System.out.println("Current mountain bike' speed: " + speed);
        }
    }


    @Override
    public void applyBrakes(int brakingValue) {
        if (brakingValue < 0) {
            System.out.println("Braking value cannot be negative. Please use positive number.");
        } else if (speed - brakingValue <= -11) {
            System.out.println("Braking value is too high. The highest possible braking value is: " + (speed + 10));
        } else {
            speed -= brakingValue;
            System.out.println("Current speed: " + speed);
        }
    }


}