import java.util.Scanner;

public class Program1 {

    // Method for addition
    public double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;  // Return NaN if division by zero
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Program1 cal = new Program1();

        System.out.println("Welcome to the Calculator!");

        // Input values from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform the operation based on the operator
        double result = 0;
        boolean validOperator = true;

        if (operator == '+') {
            result = cal.add(num1, num2);
        } else if (operator == '-') {
            result = cal.subtract(num1, num2);
        } else if (operator == '*') {
            result = cal.multiply(num1, num2);
        } else if (operator == '/') {
            result = cal.divide(num1, num2);
            if (Double.isNaN(result)) {  // Check if division by zero occurred
                validOperator = false;
            }
        } else {
            System.out.println("Invalid operator. Please use +, -, *, or /.");
            validOperator = false;
        }

        if (validOperator) {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}