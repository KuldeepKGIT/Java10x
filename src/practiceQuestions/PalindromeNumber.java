package practiceQuestions;

import java.util.Scanner;

public class PalindromeNumber {
    public static boolean palindromeCheck(int num){
        int reverse = 0;
        int temp = num;
        boolean flag = false;
        while(temp>0){
           //Extracting last digit from the num and updating temp
            reverse = reverse*10+(temp%10);
            temp =temp/10;
        }
        if(num==reverse){
            flag = true;
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        if(palindromeCheck(num)){
            System.out.println(num+" : is a palindrome number");
        }
        else {
            System.out.println(num+" : is not a palindrome number");
        }
    }
}
