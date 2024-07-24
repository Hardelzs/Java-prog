package javasclass;
public class factorial {

    public static void main(String[] args) {
      int num = 5;
      int num2 = 2;
      long factorial = 1;
      for(int j = 1; j <= num; ++j){
        factorial *= j;
      }
      for(int i = 1; i <= num2; ++i) {
        System.out.println(i + "*");
        factorial *= i;
      }
      System.out.printf("Factorial of %d = %d", num, factorial);
    }
  }




