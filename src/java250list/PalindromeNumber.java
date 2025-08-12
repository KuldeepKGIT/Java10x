package java250list;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a valid number");
        int number = scanner.nextInt();
        palindromeCheck(number);
    }
    public static void palindromeCheck(int num){
        if(num<0){
            System.out.println("invalid input!");
            return;
        }
        int temp = num;
        int reverse= 0;
        while(temp!=0){
            int rem = temp%10; //extracting last digit
            reverse = (reverse*10)+rem;
            temp = temp/10;  // removing last digit
        }
        if(num == reverse){
            System.out.println(num+": is a palindrome number");
        }
        else {
            System.out.println(num+": is not a palindrome number");
        }
    }
}
