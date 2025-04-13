import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("     SIMPLE CALCULATOR     ");
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter an operator: (+,-,*,/,^) ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            boolean operationIsValid = true;
            switch (operator) {
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;
                case '/' -> {
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero(0)");
                        operationIsValid = false;
                    } else {
                        result = num1 / num2;
                    }
                }
                case '^' -> result = Math.pow(num1, num2);
                default -> {
                    operationIsValid = false;
                    System.out.println("Operator NOT valid!");
                }
            }
            if (operationIsValid)
                System.out.printf("%f%c%f=%f", num1, operator, num2, result);
        }
    }
}
