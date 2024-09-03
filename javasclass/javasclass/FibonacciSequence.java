package javasclass; // Assuming this is the intended package name

import java.util.Scanner;

public class FibonacciSequence { // Class name should follow CamelCase convention

    public static int fib(int n) { // Method name should follow camelCase convention
        if (n <= 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to calculate the Fibonacci sequence sum:");
        int n = input.nextInt();

        // Calculate the Fibonacci sequence sum using an iterative approach (more efficient for larger n)
        int sum = 0;
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            sum += a;
            int c = a + b;
            a = b;
            b = c;
        }

        System.out.printf("Fibonacci sequence sum of %d is %d\n", n, sum);

        // Optional: Print the Fibonacci sequence itself (if desired)
        System.out.print("Fibonacci sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();

        input.close(); // Close the Scanner to avoid resource leaks
    }
}
