package com.gyk.java.oop.basics;

public class PointApplication {

    public static void main(String[] args) {
        // write your code here
        MyPoint point1 = new MyPoint(1, 8);
        MyPoint point2 = new MyPoint(1, 2);
        MyPoint point3 = new MyPoint();
        int[] coordinates = new int[2];
        // You must use a loop to print response from getXY method for first point.
        coordinates = point1.getXY();
        for (int i = 0; i < coordinates.length; i++) {
            System.out.println("coordinates from array: " + coordinates[i]);
            if (i == 0) {
                point3.setX(coordinates[i]);
            } else if (i == 1) {
                point3.setY(coordinates[i]);
            }
        }
        System.out.println("Coordinates got from loop: " + point3);

        // You must print second point getXY data x and y coordinates without using loop.
        System.out.println("Version1: Easiest way: " + point2);
        coordinates = point2.getXY();
        point3.setXY(coordinates[0], coordinates[1]);
        System.out.println("Version2: Just to test setXY: " + point3);
        System.out.println("Version3: Working with array values: " + new MyPoint(coordinates[0], coordinates[1]));

        double distance;
        distance = point1.distance(coordinates[0],coordinates[1] );
        System.out.println("Distance between Point1 and Point2 coordinates: "+distance);
        distance = point1.distance(point2);
        System.out.println("Distance between Point1 and Point2: "+distance);
        distance = point1.distance();
        System.out.println("Distance from (0,0) till Point1: "+distance);

    }
}

