package javasclass;
public class PascalsTriangle {

    public static void main(String[] args) {
      int rows = 10;
  
      for (int i = 0; i < rows; i++) {
        // Print leading spaces
        for (int j = 0; j < rows - i - 1; j++) {
          System.out.print(" ");
        }
  
        // Print coefficients
        for (int j = 0; j <= i; j++) {
          System.out.print(calculateCoefficient(i, j) + " ");
        }
  
        System.out.println(); // Move to next line
      }
    }
  
    // Function to calculate the binomial coefficient (nCr)
    static int calculateCoefficient(int n, int r) {
      if (r == 0 || r == n) {
        return 1;
      } else {
        return calculateCoefficient(n - 1, r - 1) + calculateCoefficient(n - 1, r);
      }
    }
  }
  
