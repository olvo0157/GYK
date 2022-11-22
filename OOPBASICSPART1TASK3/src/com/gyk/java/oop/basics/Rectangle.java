package com.gyk.java.oop.basics;

public class Rectangle {
    private double length;
    private double width;

    boolean isValid(){
        return (length>0&&width>0);
    }
    double getPerimeter(){
        return (length+width)*2;
    }
    double getArea(){
        return length*width;
    }
    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
