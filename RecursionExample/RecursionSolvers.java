/**
 * Implementation of recursive mathematical algorithms (Factorial and Fibonacci).
 */
public class RecursionSolvers {

    /**
     * Calculates factorial of a number recursively.
     * Formula: n! = n * (n-1)! where 0! = 1.
     * Time Complexity: O(N).
     * Space Complexity: O(N) due to stack call frames.
     */
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1; // Base case
        }
        return n * factorial(n - 1); // Recursive case
    }

    /**
     * Calculates the N-th Fibonacci number recursively.
     * Formula: F(n) = F(n-1) + F(n-2) where F(0) = 0, F(1) = 1.
     * Time Complexity: O(2^N) due to branching recursive calls.
     * Space Complexity: O(N) call stack size.
     */
    public int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Fibonacci index cannot be negative.");
        }
        if (n == 0) return 0; // Base case 1
        if (n == 1) return 1; // Base case 2
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }
}
