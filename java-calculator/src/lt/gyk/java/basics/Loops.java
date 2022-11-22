package lt.gyk.java.basics;

import java.util.Scanner;

public class Loops {
    // task 7
    public static void main(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter days per year:");
        int days = Integer.parseInt(scanner.nextLine());
        long hours=Long.parseLong("0");
        long minutes = Long.parseLong("0");
        for (int day=1; day<=days;day++){
            hours+= 24;
            minutes+=24*60;
        }
        System.out.println("There are "+String.valueOf(hours)+" or "+String.valueOf(minutes)+" in one year.");
    }
    // task 8
    public static void hoursMinutesWhile(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter days per year:");
        int days = Integer.parseInt(scanner.nextLine());
        long hours=Long.parseLong("0");
        long minutes = Long.parseLong("0");
        int day=1;
        while (day<=days){
          hours+= 24;
          minutes+=24*60;
          day++;
        }
        System.out.println("There are "+String.valueOf(hours)+" or "+String.valueOf(minutes)+" in one year.");
    }
    // task 9
    public static void factorial(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter integer number:");
        int intNumber = Integer.parseInt(scanner.nextLine());
        long numberFactorial=1;
        for (int i=1; i<=intNumber;i++){
            numberFactorial=numberFactorial*i;
        }
        System.out.println("Factorial of number "+intNumber+" is "+String.valueOf(numberFactorial)+".");
    }
}
/*
Choose while or for loop and calculate factorial of a number. Your program should take an integer number and calculate it’s factorial and output response to the console.
Input: 5
Output: Factorial of number 5 is 120.
 */