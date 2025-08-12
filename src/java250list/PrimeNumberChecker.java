package java250list;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        System.out.println(num+": is a prime number "+primeNumChecker(num));
    }
    public static boolean primeNumChecker(int number){
        boolean isPrime = number>1;
        for(int i=2; i<=Math.sqrt(number); i++){
            if(number%i==0){
                isPrime=false;
            }
        }
        return isPrime;
    }
}
