package javasclass;
public class factorial {

    public static void main(String[] args) {
      int num = 5;
      long factorial = 1;
      for(int j = 1; j <= num; ++j){
        factorial *= j;
      }
      System.out.printf("Factorial of %d = %d", num, factorial);
    }
  }




