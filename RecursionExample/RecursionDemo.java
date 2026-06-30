public class RecursionDemo {
    public static void main(String[] args) {
        RecursionSolvers solver = new RecursionSolvers();

        int factNum = 5;
        System.out.println("Factorial of " + factNum + " is: " + solver.factorial(factNum));

        int fibCount = 10;
        System.out.print("Fibonacci series up to " + fibCount + " terms: ");
        for (int i = 0; i < fibCount; i++) {
            System.out.print(solver.fibonacci(i) + " ");
        }
        System.out.println();
    }
}
