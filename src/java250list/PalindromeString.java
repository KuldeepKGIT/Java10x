package java250list;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scanner.nextLine().toLowerCase();
        String revStr = PalindromeCheck(str);
        if (str.equals(revStr)) {
            System.out.println(str+": is a palindrome");
        }
        else {
            System.out.println(str+": is not a palindrome");
        }
    }
    public static String PalindromeCheck(String str){
        int n = str.length()-1;
        StringBuilder reverse = new StringBuilder();
        for(int i=n; i>=0; i--){
            reverse.append(str.charAt(i));
        }
        return reverse.toString();
    }
}
