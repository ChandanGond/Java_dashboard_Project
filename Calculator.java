/* The program will then prompt you to enter the first, operator, and second numbers.
After inputting the values, it will calculate and display the result. Just to let you know, this is a 
simple calculator and does not handle more advanced operations or error handling beyond division by zero. */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double num1, num2;
            char operator;
            
            System.out.println("Simple Calculator");
            System.out.println("------------------");

            // Input first number
            System.out.print("Enter the first number: ");
            num1 = scanner.nextDouble();

            // Input operator
            System.out.print("Enter an operator (+, -, *, /): ");
            operator = scanner.next().charAt(0);

            // Input second number
            System.out.print("Enter the second number: ");
            num2 = scanner.nextDouble();

            double result = 0;

            // Perform the calculation based on the operator
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Cannot divide by zero.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator.");
                    return;
            }

            // Display the result
            System.out.println("Result: " + result);
        }
    }
}

