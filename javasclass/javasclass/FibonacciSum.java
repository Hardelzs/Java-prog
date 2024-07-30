package javasclass;
public class FibonacciSum {

  public static void main(String[] args) {
    // Number of terms
    int n = 50; 
    int firstTerm = 0, secondTerm = 1, sum = 0;

    for (int i = 0; i < n; ++i) {
      sum += firstTerm;
      // Update terms for next iteration
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }

    System.out.printf("Sum of the first %d Fibonacci numbers: %d", n, sum);
  }
}

