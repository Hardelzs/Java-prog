package javasclass;
public class ReverseStringStringBuilder {

    public static String reverse(String str) {
      return new StringBuilder(str).reverse().toString();
    }
  
    public static void main(String[] args) {
      String originalString = "Hello, World!";
      String reversedString = reverse(originalString);
      System.out.println("Original String: " + originalString);
      System.out.println("Reversed String: " + reversedString);
    }
  }
  