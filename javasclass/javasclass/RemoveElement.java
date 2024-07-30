package javasclass;
import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
      int[] arr = {1, 2, 2, 3, 3, 3, 4, 5};
      // Element to be removed
      int elementToRemove = 3; 
  
      int j = 0; // Index for the new array (without duplicates)
      for (int num : arr) {
        if (num != elementToRemove) {
          arr[j++] = num; // Copy the element if it's not the one to remove
        }
      }
  
      // The actual number of elements remaining is the value of j
      int[] newArr = Arrays.copyOfRange(arr, 0, j); 
  
      System.out.println("Original array: " + java.util.Arrays.toString(arr));
      System.out.println("Array after removing element, " +"key: " +  elementToRemove + ": " + java.util.Arrays.toString(newArr));
    }
  }
  