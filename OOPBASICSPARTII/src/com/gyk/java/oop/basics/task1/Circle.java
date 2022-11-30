package com.gyk.java.oop.basics.task1;

public class Circle extends Shape{
    private double radius;
    private double perimeter;
    private double area;

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area= Math.PI*radius*radius;
    }

    @Override
    public void calculatePerimeter() {
        perimeter= 2*Math.PI*radius;
    }
}