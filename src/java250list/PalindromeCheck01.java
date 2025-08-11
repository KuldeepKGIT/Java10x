package java250list;

import java.util.Scanner;

public class PalindromeCheck01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scanner.nextLine().toLowerCase();
        System.out.println(str + ": " + palindromeCheck(str));
    }
    public static boolean palindromeCheck(String str){
        boolean isPalindrome = false;
        String revString = new StringBuilder(str).reverse().toString();
        if (str.equals(revString)) {
            isPalindrome = true;
        }
        return isPalindrome;
    }
}
