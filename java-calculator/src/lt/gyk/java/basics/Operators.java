package lt.gyk.java.basics;

import java.util.Scanner;

public class Operators {
    // Task5
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter triangle sides: ");
        int input1 = Integer.parseInt(scanner.next());
        int input2 = Integer.parseInt(scanner.next());
        int input3 = Integer.parseInt(scanner.next());
        String triangleType = "";

        if (isInvalid(input1, input2, input3)){
            triangleType = "invalid";
        } else if (isEquilateral(input1, input2, input3)) {
            triangleType = "Equilateral";
        } else if (isIsosceles(input1, input2, input3)) {
            triangleType = "Isosceles";
        } else {
            triangleType = "Scalene";
        }
        System.out.println(input1);
        System.out.println("Triangle is " + triangleType + ". Sides: " + input1 + " " + input2 + " " + input3);
    }

    static boolean isInvalid(int a, int b, int c) {
        return (a + b <= c || a + c <= b || b + c <= a);
    }

    static boolean isEquilateral(int a, int b, int c) {
        return (a == b && b == c);
    }

    static boolean isIsosceles(int a, int b, int c) {
        return (a == b || a == c || b == c);
    }
    // Task6
    public static void carTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter distance, fuel in the tank, fuel usage, fuel price:");
        float distance = Float.parseFloat(scanner.next());
        float fuelBefore = Float.parseFloat(scanner.next());
        float fuelUsage = Float.parseFloat(scanner.next());
        float fuelPrice = Float.parseFloat(scanner.next());
        float fuelForDistance = fuelUsage*distance/100;
        float fuelAfter = fuelBefore-fuelForDistance;
        String message;
        String literLiters=" liters";
        if (Math.abs(fuelAfter)==1){
            literLiters=" liter";
        }
        if (fuelAfter<0){
          float fuelCost = Math.abs(fuelAfter*fuelPrice);
          message = "Destination is in "+distance+"km. Car is not able to reach the destination. It needs "+Math.abs(fuelAfter)+literLiters+" of fuel more. It will cost "+fuelCost+".";
        } else {
            message = "Destination is in "+distance+"km. Car is able to reach the destination. It will have "+fuelAfter+literLiters+" of fuel left.";
        }

        System.out.println(message);
    }
}


/*
Create a method which determines whether a car will be able to drive to the destination or not. In case if car is not able to drive.
Print out how much fuel does it need to fill the tank more to be able to drive to the destination as well as how much will it cost.
If it is able to drive to the destination write how much fuel will it have left on the tank.
Program has four parameters: distance to the destination, how much fuel does the car have in the tank, car fuel usage per 100km and fuel price per liter.
Input (negative flow): 100 6 7 1.25
Output: Destination is in 100km. Car is not able to reach the destination. It needs 1 liter of fuel more. It will cost 1.25.
Input (happy flow): 110 25 7 1.25
Output: Destination is in 110km. Car is able to reach the destination. It will have 17.3 liters of fuel left.

        */
