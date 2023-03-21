package javahomework;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Programme10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter arithmetic operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Perform arithmetic operation based on the operator entered by the user
        double result = 0;
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 == 0) {
                System.out.println("Error: Division by zero");
                return;
            }
            result = num1 / num2;
        } else {
            System.out.println("Error: Invalid operator entered");
            return;
        }
        // Print the result
        System.out.println("Result: " + result);
        scanner.close();
    }
}

