/**
 * @author Mac Lawson
 * Date: 3/29/22
 * Purpose: Calculating Fib. numbers
 * */
import java.util.Scanner;

public class FibonacciNumbers {
    // OOP design with FibonacciCalculator class
    private int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // User input prompt and error trapping for invalid input
    private int getInput(Scanner scanner) {
        while (true) {
            System.out.print("Number to Calculate Fibonacci Value: ");
            String input = scanner.nextLine();
            if (input.equals("q")) {
                System.exit(0); // Terminate program on "q"
            }
            try {
                int n = Integer.parseInt(input);
                if (n < 0) {
                    throw new IllegalArgumentException("Input must be a non-negative integer.");
                }
                return n;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a non-negative integer or \"q\" to quit.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        System.out.println("Calculate Fibonacci Value");
        System.out.println("Enter \"q\" to quit");

        FibonacciNumbers calculator = new FibonacciNumbers();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = calculator.getInput(scanner);
            int fibonacci = calculator.fibonacci(n);
            System.out.println("Fibonacci value of " + n + " is " + fibonacci + ".");
        }
    }
}

