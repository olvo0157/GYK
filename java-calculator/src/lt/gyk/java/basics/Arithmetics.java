package lt.gyk.java.basics;

import java.util.Scanner;

public class Arithmetics {
    // Task3
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cube side length in cm:");
        String input = scanner.nextLine();
        double inputDbl = Double.parseDouble(input);
        double volume = Math.pow(inputDbl, 3);
        double perimeter = inputDbl * 12;
        System.out.println("Cube’s volume: " + String.valueOf(volume) + "cm3");
        System.out.println("Cube’s perimeter: " + String.valueOf(perimeter) + "cm");

    }
    // Task4
    static void converterFeetInch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter feet:");
        String input = scanner.nextLine();
        double feet = Double.parseDouble(input);
        System.out.println("Enter inches:");
        input = scanner.nextLine();
        double inches = Double.parseDouble(input);
        double result = (feet * 12 + inches) * 2.54;
        System.out.println(feet+" feet and "+inches+" inches = "+result);
    }

}
