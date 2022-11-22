package com.gyk.java.oop.basics;

public class ShapeApplication {
    public static void main(String[] args) {
        Rectangle[] rectangles=new Rectangle[5];
        rectangles[0]=new Rectangle(1,20);
        rectangles[1]=new Rectangle(2,20);
        rectangles[2]=new Rectangle(3,-20);
        rectangles[3]=new Rectangle(4,10);
        rectangles[4]=new Rectangle(5,10);
        for (Rectangle rectangle:rectangles
             ) {
            if(!rectangle.isValid()){
                System.out.println("Shape is invalid: "+rectangle);
            }else {
                System.out.println(rectangle + " perimeter: "+rectangle.getPerimeter() + ", area: "+rectangle.getArea());
            }

        }
    }
}

