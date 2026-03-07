import java.util.Scanner;

/**
 * A simple calculator program that performs basic arithmetic operations.
 * Implements best practices such as input validation, resource management,
 * and modular method design.
 */
public class Calculator {

    public static void main(String[] args) {
        // Using try-with-resources to automatically close the Scanner and prevent memory leaks
        try (Scanner scanner = new Scanner(System.in)) {
            boolean appRunning = true;

            while (appRunning) {
                System.out.println("\n===============================");
                System.out.println("=== Simple Java Calculator ===");
                System.out.println("===============================");
                System.out.println("(Type 'exit' at any prompt to quit current operations)");

                boolean operationLoop = true;
                while (operationLoop) {
                    // 1. Get the first number (with exit logic)
                    String num1Input = getRawInput(scanner, "Enter the first number: ");
                    if (num1Input.equalsIgnoreCase("exit")) break;
                    double num1 = Double.parseDouble(num1Input);

                    // 2. Get the mathematical operator (with exit logic)
                    String opInput = getRawInput(scanner, "Enter an operator (+, -, *, /): ");
                    if (opInput.equalsIgnoreCase("exit")) break;
                    if (!isValidOperator(opInput)) {
                        System.out.println("Error: Invalid operator.");
                        continue;
                    }
                    char operator = opInput.charAt(0);

                    // 3. Get the second number (with exit logic)
                    String num2Input = getRawInput(scanner, "Enter the second number: ");
                    if (num2Input.equalsIgnoreCase("exit")) break;
                    double num2 = Double.parseDouble(num2Input);

                    // 4. Perform calculation and display result
                    calculateAndDisplay(num1, operator, num2);

                    // 5. Ask to perform another operation
                    System.out.print("\nDo you want to perform another operation? (y/n): ");
                    String response = scanner.next().trim().toLowerCase();
                    if (!response.equals("y") && !response.equals("yes")) {
                        operationLoop = false;
                    }
                }

                // 6. Terminal Session Management: Ask to restart the entire app or exit
                System.out.println("\n[Calculator Session Ended]");
                System.out.print("Type 'restart' to open the calculator again, or any other key to exit terminal: ");
                String sessionResponse = scanner.next().trim().toLowerCase();

                if (!sessionResponse.equals("restart")) {
                    appRunning = false;
                    System.out.println("Closing terminal session. Goodbye!");
                } else {
                    System.out.println("\nRe-initializing...");
                }
            }

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    /**
     * Helper to get raw string input to check for 'exit' command before parsing.
     */
    private static String getRawInput(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.next().trim();
            if (input.equalsIgnoreCase("exit")) return "exit";
            
            try {
                // If the prompt is for a number, verify it's a number
                if (prompt.contains("number")) {
                    Double.parseDouble(input);
                }
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter a valid number or 'exit'.");
            }
        }
    }

    /**
     * Validates if the string is a single valid operator.
     */
    private static boolean isValidOperator(String input) {
        return input.length() == 1 && "+-*/".contains(input);
    }

    /**
     * Performs the calculation using a switch statement and prints the result.
     * @param num1     The first operand.
     * @param operator The mathematical operator.
     * @param num2     The second operand.
     */
    private static void calculateAndDisplay(double num1, char operator, double num2) {
        double result = 0;
        boolean isValidOperation = true;

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
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is undefined.");
                    isValidOperation = false;
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("Error: Unrecognized operator.");
                isValidOperation = false;
        }

        if (isValidOperation) {
            System.out.printf("Result: %.2f %c %.2f = %.2f%n", num1, operator, num2, result);
        }
    }
}