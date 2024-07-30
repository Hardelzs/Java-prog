package javasclass;
public class SumOfArray {

    public static void main(String[] args) {
      // Initialize array 
      int[] numbers = {10, 20, 30, 40, 50};
      int sum = 0;
  
      // Loop through the array and add elements to the sum
      for (int number : numbers) {
        sum += number;
      }
  
      System.out.println("The sum of the array elements is: " + sum);
    }
  }
  