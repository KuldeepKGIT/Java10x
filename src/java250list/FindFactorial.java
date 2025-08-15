package java250list;

import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        int factorial = num;

        for(int i = num; i>1; i--){
            factorial *=(i-1);
        }
        System.out.println("Factorial of given input is: "+ factorial);
    }
}
