package devStrings;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number!");
        int num = scanner.nextInt();
        int temp = num;
        int n = String.valueOf(num).length();
        int sum = 0;
        while(temp!=0){
            int rem = temp%10;
            sum = (int) (sum+ Math.pow(rem, n));
            temp /= 10;
        }
        if(num == sum){
            System.out.println(num + " is an armstrong number");
        }
        else{
            System.out.println(num + " is not an armstrong number");
        }

    }

}
