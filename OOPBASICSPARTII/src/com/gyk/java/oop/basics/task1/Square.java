package com.gyk.java.oop.basics.task1;

public class Square extends Shape{
    private double side;
    private double perimeter;
    private double area;
    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }

    @Override
    public void calculateArea() {
        area= side*side;
    }

    @Override
    public void calculatePerimeter() {
        perimeter= side*4;
    }
}
