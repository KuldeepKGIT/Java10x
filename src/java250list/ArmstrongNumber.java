package java250list;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check");
        int num = scanner.nextInt();
        int digits = String.valueOf(num).length();
        int original = num;
        int result =0;
        while(num !=0){
            int d = num%10;
            result += (int)Math.pow(d,digits);
            num /= 10;
        }
        if(original == result){
            System.out.println(original +" : is an armstrong");
        }
        else {
            System.out.println(original +" : is not an armstrong");
        }
        scanner.close();
    }
}
