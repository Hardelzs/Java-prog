package javasclass;
import java.util.Arrays;

public class RemoveDuplicatesSortedArray {

  public static void main(String[] args) {
    int[] arr = {1, 2, 2, 3, 3, 3, 4, 5};
    // Sort the array (required for this approach)
    Arrays.sort(arr); 
    
    // j keeps track of the index for unique elements
    int j = 0;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] != arr[j]) {
        // Element is unique, move it to the next position
        arr[++j] = arr[i];
      }
    }

    // The actual number of unique elements is j + 1 (since 0th element is always included)
    int[] uniqueArr = Arrays.copyOfRange(arr, 0, j + 1);

    System.out.println("Original array: " + java.util.Arrays.toString(arr));
    System.out.println("Array after removing duplicates: " + java.util.Arrays.toString(uniqueArr));
  }
}
