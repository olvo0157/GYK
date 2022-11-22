package com.gyk.java.oop.basics.task1;

public class ShapeApplication {
    public static void main(String[] args) {
        Shape[] shapes= new Shape[]{new Circle(10), new Square(5)};
        for (Shape shape:shapes
             ) {
            shape.calculateArea();
            shape.calculatePerimeter();
            System.out.println(shape);

        }
    }
}
