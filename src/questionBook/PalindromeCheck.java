package questionBook;

import java.util.Scanner;

public class PalindromeCheck {
    public static boolean palindromeCheck(String str){
        boolean isPalndrome = false;
        String reverse = new StringBuilder(str).reverse().toString();
        if(str.equals(reverse)){
            isPalndrome = true;
        }
        return isPalndrome;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scanner.nextLine().toLowerCase();
        if(palindromeCheck(str)){
            System.out.println(str+" : is a palindrome");
        }
        else {
            System.out.println(str+" : is not a palindrome");
        }
    }
}
