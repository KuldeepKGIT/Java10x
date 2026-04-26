package devStrings;

import java.util.Scanner;

public class PalindromeStringCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scanner.nextLine().toLowerCase();
        if (palindromeCheck(str)) {
            System.out.println(str+ " String is Palindrome");
        }
        else{
            System.out.println(str+" String is not palindrome");
        }

    }
    public static boolean palindromeCheck(String str){
        boolean flag = true;
        String reverse = new StringBuilder(str).reverse().toString();
        if(!str.equals(reverse)){
            flag = false;
        }
        return flag;
    }
}
