public class Calculator {
    public double addition(double argumentOne, double argumentTwo) {
        return argumentOne + argumentTwo;
    }

    public double subtraction(double argumentOne, double argumentTwo) {
        return argumentOne - argumentTwo;
    }

    public double multiplication(double argumentOne, double argumentTwo) {
        return argumentOne * argumentTwo;
    }

    public double division(double argumentOne, double argumentTwo) throws IllegalArgumentException {
        if (argumentTwo == 0) {
            throw new IllegalArgumentException("Division by zero!!!");
        }
        return argumentOne / argumentTwo;
    }

    public double remainderAfterDivision(double argumentOne, double argumentTwo) {
        return argumentOne - Math.floor(argumentOne / argumentTwo) * argumentTwo;
    }
}