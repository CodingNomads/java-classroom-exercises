package lambdas;

import java.util.Scanner;
import java.util.function.BiFunction;

/**
 * Create a class calculator that has only one method that uses a BiFunction<T, U, R>.
 * Create variables with lambdas that contain the 4 main operations (+, -, *, /)
 *
 * Use the calculator with the lambdas to make operations.
 */

public class Ex07CalculatorWithLambdas {

    private static final Calculator calculator = new Calculator();
    private static Double result;

    public static void main(String[] args) {

        System.out.println("Type with one symbol the operation you want and hit enter: ");
        String operation = new Scanner(System.in).nextLine();

        switch (operation) {
            case "+":
                result = calculator.calculate((n1, n2) -> (n1 + n2));
                break;
            case "-":
                result = calculator.calculate((n1, n2) -> (n1 - n2));
                break;
            case "*":
                result = calculator.calculate((n1, n2) -> (n1 * n2));
                break;
            case "/":
                result = calculator.calculate((n1, n2) -> (n1 / n2));
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
        System.out.println(result);
    }
}

class Calculator {

    public Double calculate(BiFunction<Double,Double,Double> biFunction) {
        System.out.println("Input your first and second numbers separated by enter: ");
        return biFunction.apply(new Scanner(System.in).nextDouble(), new Scanner(System.in).nextDouble());
    }
}
