package moneyMul;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String!");
        String str = scanner.nextLine().toLowerCase();
        System.out.println("Original String: " + str);
      String reverseStr = new StringBuilder(str).reverse().toString();
        if (reverseStr.equals(str)) {
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}
