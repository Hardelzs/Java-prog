package javasclass;
public class PalindromeString {

    public static boolean isPalindrome(String str) {
      int n = str.length();
  
      // Handle empty string or string with one character (considered palindromes)
      if (n <= 1) {
        return true;
      }
  
      // Convert to lowercase to ignore case sensitivity
      str = str.toLowerCase();
  
      // Two pointers: i at the beginning and j at the end
      int i = 0, j = n - 1;
      while (i < j) {
        // Skip non-alphanumeric characters
        while (i < j && !Character.isLetterOrDigit(str.charAt(i))) {
          i++;
        }
        while (i < j && !Character.isLetterOrDigit(str.charAt(j))) {
          j--;
        }
  
        // Compare characters, ignoring case
        if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) {
          return false;
        }
        i++;
        j--;
      }
  
      return true;
    }
  
    public static void main(String[] args) {
      String str1 = "madam";
      String str2 = "A man, a plan, a canal: Panama"; // Punctuation and spaces ignored
      String str3 = "Race car";
  
      System.out.println(str1 + " is palindrome: " + isPalindrome(str1));
      System.out.println(str2 + " is palindrome: " + isPalindrome(str2));
      System.out.println(str3 + " is palindrome: " + isPalindrome(str3));
    }
  }
  