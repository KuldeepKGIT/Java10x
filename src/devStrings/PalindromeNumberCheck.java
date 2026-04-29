package devStrings;

import java.util.Scanner;

public class PalindromeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        if(palindromeCheck(num)){
            System.out.println(num+" number is palindrome");
        }
        else {
            System.out.println(num+"number is not palindrome");
        }

    }
    public static boolean palindromeCheck(int num){
        boolean flag = false;
        if(num<0){
            return flag;
        }
        int temp = num;
        int rev = 0;
        while(temp!=0){
            rev =  (rev*10)+temp%10;
            temp = temp/10;
        }
        if(num==rev){
            flag =  true;
        }
        return flag;
    }
}
