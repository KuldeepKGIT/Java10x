package infinity;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = scanner.nextInt();

        if(armStrong(num)==num){
            System.out.println(num+" is an armStrong number");
        }
        else {
            System.out.println(num+" is not an armStrong number");
        }


    }

    public static long armStrong(int num) {
        if (num < 0) {
            System.out.println("Invalid Input");
        }
        int count = String.valueOf(num).length();
        int result = 0;
        while (num != 0) {
            int temp = num % 10;
            result += (int) Math.pow(temp,count);
            num/=10;
        }
        return result;

    }
}