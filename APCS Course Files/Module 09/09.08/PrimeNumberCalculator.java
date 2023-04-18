public class PrimeNumberCalculator {
    private int lowerLimit;
    private int upperLimit;
    private int primeCount;

    public PrimeNumberCalculator(int lowerLimit, int upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
        this.primeCount = 0;
    }

    // Check if a given number is prime
    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Calculate and count the prime numbers within the given range
    public void calculatePrimeNumbers() {
        for (int i = lowerLimit; i <= upperLimit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                primeCount++;
            }
        }
    }

    // Get the number of prime numbers found
    public int getPrimeCount() {
        return primeCount;
    }
}
