package questionBook;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number!");
        int num = scanner.nextInt();
        if (num < 2) {
            System.out.println("Invalid input!");
            return;
        }
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                 flag = false;
            }


        }
        if(flag){
            System.out.println("Number is prime number");
        }
        else {
            System.out.println("Number is not a prime number");
        }
    }
}
