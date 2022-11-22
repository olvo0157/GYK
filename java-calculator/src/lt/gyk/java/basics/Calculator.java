package lt.gyk.java.basics;

import java.util.Scanner;

public class Calculator {
    // Task10
    public static void main(String[] args) {
        double perimeter;
        double area;
        int side1;
        int side2;
        int side3;
        Scanner scanner = new Scanner(System.in);
        String toContinue="Y";
        while (toContinue.equals("Y")){
        System.out.println("Enter figure (T, R, S) and sides:");
        String figure = scanner.next();
        switch (figure.toUpperCase()) {
            case "T":
                side1 = Integer.parseInt(scanner.next());
                side2 = Integer.parseInt(scanner.next());
                side3 = Integer.parseInt(scanner.next());
                if (!validTriangle(side1,side2,side3)) {
                    System.out.println("Values are incorrect!");
                    break;
                }
                perimeter=trianglePerimeter(side1,side2,side3);
                area = triangleArea(side1,side2,side3);
                System.out.println("Triangle perimeter is "+perimeter+" and area is "+area+".");
                break;
            case "R":
                side1 = Integer.parseInt(scanner.next());
                side2 = Integer.parseInt(scanner.next());
                if (!validSide(side1)||!validSide(side2)) {
                    System.out.println("Values are incorrect!");
                    break;
                }
                perimeter=rectanglePerimeter(side1,side2);
                area = rectangleArea(side1,side2);
                System.out.println("Rectangle perimeter is "+perimeter+" and area is "+area+".");
                break;
            case "S":
                side1 = Integer.parseInt(scanner.next());
                if (!validSide(side1)) {
                    System.out.println("Values are incorrect!");
                    break;
                }
                perimeter=squarePerimeter(side1);
                area = squareArea(side1);
                System.out.println("Square perimeter is "+perimeter+" and area is "+area+".");
                break;
            default:
                System.out.println("Error. Invalid figure name!");
        }
        System.out.println("Do you want to run it again? (Y/N)");
         toContinue = scanner.next().toUpperCase();}
    }

    static double trianglePerimeter(int side1, int side2, int side3) {
        return side1 + side2 + side3;
    }

    static double triangleArea(int side1, int side2, int side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    static double rectanglePerimeter(int side1, int side2) {
        return (side1 + side2) * 2;
    }

    static double rectangleArea(int side1, int side2) {
        return side1 * side2;
    }

    static double squarePerimeter(int side1) {
        return side1 * 4;
    }

    static double squareArea(int side1) {
        return side1 * side1;
    }
    static boolean validTriangle(int a, int b, int c){
        return !(a + b <= c || a + c <= b || b + c <= a||a==0||b==0||c==0);
    }
    static boolean validSide(int a){
        return (a!=0);
    }
}
/*
Task:
Using what you have learned create a calculator which will calculate figures perimeter and area.
You must use switch statement for choosing a figure.
Program should run as long as you want to continue using calculator.
This means that after calculations are done it must ask if you want to run it again.
You must check whether input values are correct if not write an error message that values were incorrect.
Calculator must be able to calculate Triangle, Rectangle and Square perimeter and area.
Input (happy flow): Rectangle 5 7
Output: Rectangle perimeter is 24 and area is 35.
Input (negative flow): Rectangle 0 7
Output: Rectangle edge can’t be 0.

 */