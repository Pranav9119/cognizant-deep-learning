/**
 * Demo runner for Recursion mathematical methods.
 */
public class RecursionDemo {
    public static void main(String[] args) {
        RecursionSolvers solver = new RecursionSolvers();

        // 1. Factorial
        int factNum = 5;
        int factResult = solver.factorial(factNum);
        System.out.println("Factorial of " + factNum + " is: " + factResult);

        // 2. Fibonacci Series (Printing first 10 terms)
        int fibCount = 10;
        System.out.print("Fibonacci series up to " + fibCount + " terms: ");
        for (int i = 0; i < fibCount; i++) {
            System.out.print(solver.fibonacci(i) + " ");
        }
        System.out.println();
    }
}
