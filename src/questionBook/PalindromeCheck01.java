package questionBook;

import java.util.Scanner;

public class PalindromeCheck01 {
    public static boolean palindromeCheck(String str){
        boolean isPalindrome = true;
        int start = 0;
        int end = str.length()-1;
        while (start<end){
            if(str.charAt(start) !=str.charAt(end)){
                isPalindrome = false;
                break;
            }
            end--;
            start++;

        }

        return isPalindrome;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String to check");
        String str = scanner.nextLine().toLowerCase();
        if(palindromeCheck(str)){
            System.out.println("String is a palindrome");
        }
        else {
            System.out.println("String is not a palindrome");
        }
    }
}
