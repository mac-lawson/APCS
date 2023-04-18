import java.util.Scanner;

public class PrimeNumberCalculatorTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the lower and upper limits from the user
        System.out.print("Enter the lower limit: ");
        int lowerLimit = scanner.nextInt();
        System.out.print("Enter the upper limit: ");
        int upperLimit = scanner.nextInt();

        // Create a PrimeNumberCalculator object and calculate the prime numbers
        PrimeNumberCalculator calculator = new PrimeNumberCalculator(lowerLimit, upperLimit);
        System.out.println("Prime numbers between " + lowerLimit + " and " + upperLimit + ":");
        calculator.calculatePrimeNumbers();

        // Get the number of prime numbers found and display it to the user
        int primeCount = calculator.getPrimeCount();
        System.out.println("\nTotal prime numbers found: " + primeCount);

        scanner.close();
    }
}
