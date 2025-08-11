package java250list;

import java.util.Scanner;

public class PalindromeCheck02 {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner scanner = new Scanner( System.in);
        String str = scanner.nextLine().toLowerCase();
        if(palindromeCheck(str)){
            System.out.println(str+" : is a palindrome");
        }
        else {
            System.out.println(str+" : is not a palindrome");
        }
    }
    public static boolean palindromeCheck(String str){
        boolean isPalindrome = true;
        int start = 0;
        int end = str.length()-1;
        while(start<end){
            if (str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        return isPalindrome;
    }
}
