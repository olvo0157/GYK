package lt.gyk.java.basics;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter task Nr.:");
        String taskNr = scanner.nextLine();
        switch (taskNr){
            case "1": task1(); break;
            case "2": task2(); break;
            case "2.1": task2_1(); break;
            case "3": task3(); break;
            case "4": task4(); break;
            case "5": task5(); break;
            case "6": task6(); break;
            case "7": task7(); break;
            case "8": task8(); break;
            case "9": task9(); break;
            case "10": task10(); break;
            default:
                System.out.println("Wrong task number!");
        }
    }
    static void task1 (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name, surname, age:");
        String name = scanner.next();
        String surname = scanner.next();
        String age = scanner.next();

        String message = "Hello I am " + name + " " + surname + ". I am attending GYK 2022!";
        System.out.println(message);
    }
    static void task2 (){
        char part1 = 'H';
        short part2 = 3110;
        char part3 = 'w';
        byte part4 = 0;
        char part5 = 'r';
        int part6 = 1;
        char part7 = 'd';
        float part8 = 2.0F;
        boolean part9 = true;
        String output = String.valueOf(part1) + String.valueOf(part2) + " " + part3 + part4 + part5 + part6 + part7 + " " + part8 + " " + part9;
        // Output: H3110 w0r1d 2.0 true
        // Basics basics = new Basics(); System.out.println(basics.output);
        System.out.println(output);
    }
    static void task2_1 (){
// Task2.1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter tree height:");
        String height = scanner.nextLine();
        Art.drawTree(Integer.parseInt(height));
    }
    static void task3 (){
        Arithmetics.main(new String[]{"Is basic"});
    }
    static void task4 (){
        Arithmetics.converterFeetInch();
    }
    static void task5 (){
        Operators.main();
    }
    static void task6 (){
        Operators.carTask();
    }
    static void task7 (){
        Loops.main();
    }
    static void task8 (){
        Loops.hoursMinutesWhile();
    }
    static void task9 (){
        Loops.factorial();
    }
    static void task10 (){
        Calculator.main(new String[]{"Is basic","parametras 2"});
    }
}


