package questionBook;

import java.util.Scanner;

public class PalindromeNumber {
    public static void palindromeCheck(int num){
        if(num<0){
            System.out.println("Invalid input!");
            return;
        }
        int temp = num;
        int reverse=0;
        while(temp!=0){
            int rem = temp%10; //Extracting the last digit;
            reverse = reverse*10 + rem;
            temp = temp/10;  //removing last digit;
        }
        if(num == reverse){
            System.out.println(num+" : number is a palindrome");
        }
        else{
            System.out.println(num+" : number is not a palindrome");
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check");
        int num = scanner.nextInt();
        palindromeCheck(num);
    }
}
