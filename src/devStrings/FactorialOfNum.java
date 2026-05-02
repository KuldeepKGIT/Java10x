package devStrings;

import java.util.Scanner;

public class FactorialOfNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        System.out.println("Factorial of the number is: "+ factorial(n));
    }
    public static int factorial(int n){
        int result = n;
        while(n>1){

          result = result*(n-1);
          n--;
        }
        return result;
    }
}
