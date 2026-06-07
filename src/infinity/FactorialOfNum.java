package infinity;

import java.util.Scanner;

public class FactorialOfNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        System.out.println("Factorial of the number is: "+factorial(num));

    }
    public static int factorial(int num){
        int result = num;
        while(num>1){
            int i=1;
            result = result*(num-i);
            num--;
        }
        return result;
    }
}
