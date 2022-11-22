package calculator;
public class CalculatorFunctions {

    public static double add(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    public static double subtract(double num1, double num2) {

        double result = num1 - num2;
        return result;
    }

    public static double multiply(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

    public static double divide(double num1, double num2) {
        double result; //num1 / num2;
        if (num2 == 0) {
            System.out.println("Error. Can not be divided by zero!");
        }
        result = num1 / num2;
        return result;
    }

    public static double power(double num1, double num2) {
        double result = Math.pow(num1, num2);
        return result;
    }

    public static double square(double num) {
        double result = num * num;
        return result;
    }

    public static double squareRoot(double num) {
        double result = Math.sqrt(num);
        return result;
    }

    public static double oneDividedBy(double num) {
        double result = 1 / num;
        return result;
        // if (num == 0)
    }

    public static double log(double num) {
        double result = Math.log10(num);
        return result;
    }

    public static double rate(double num) {
        double result = num / 100;
        return result;
      }

    public static double abs(double num) {
        double result = Math.abs(num);
        return result;
    }
}
