package javasclass;
public class ReverseStringStringBuilder {

    public static String reverse(String str) {
      return new StringBuilder(str).reverse().toString();
    }
  
    public static void main(String[] args) {
      String originalString = "The world going down!";
      String reversedString = reverse(originalString);
      System.out.println("Original String: " + originalString);
      System.out.println("Reversed String: " + reversedString);
    }
  }
  