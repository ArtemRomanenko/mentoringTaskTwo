package calculatorLogic;

import java.util.Scanner;

public class CalculatorRun {

    public void runCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's start calculation");
        double firstDigit = scanner.nextDouble();
        char userSign = scanner.next().charAt(0);
        double secondDigit = scanner.nextDouble();
        calculation(firstDigit, secondDigit, userSign);
    }

    public double calculation(double first, double second, char sign) {
        double result = 0.0;
        switch (sign) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
        }

        System.out.println("Result of calculation is " + result);
        return result;
    }
}
