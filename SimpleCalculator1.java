import java.util.Scanner;

public class SimpleCalculator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Get operation
        System.out.print("Enter the operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Perform calculation
        double result = 0;

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
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                System.exit(0);
        }

        // Display the result
        System.out.println("Result: " + result);

        // Close the scanner
        scanner.close();
    }
}
