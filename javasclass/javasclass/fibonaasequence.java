package javasclass;
import java.util.Scanner;

public class fibonaasequence {
    public static fib (let n){
        if(n <= 1){
            return 1;
        } else {
            return (fib(n-1) + fib(n-2));
        }
    }

    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println ("input a number");
        int n =input.nextInt();
        System.out.println("Fibonacci sum of % {n} is % {fib(n)}");
    }
}
