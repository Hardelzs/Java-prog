package javasclass;
public class LargestElement {

    public static void main(String[] args) {
      // Initialize array (replace with your data)
      int[] numbers = {25, 14, 78, 11, 56};
      int largest = numbers[0]; // Initialize with first element
  
      // Loop through the array to find the largest
      for (int number : numbers) {
        if (number > largest) {
          largest = number;
        }
      }
  
      System.out.println("The largest element in the array is: " + largest);
    }
  }
  