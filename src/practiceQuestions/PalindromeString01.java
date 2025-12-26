package practiceQuestions;

import java.util.Scanner;

public class PalindromeString01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String!");
        String str = scanner.nextLine().toLowerCase();
        if(palindromeCheck(str)){
            System.out.println(str+" : is a palindrome string");
        }
        else {
            System.out.println(str+" : is not a palindrome string");
        }
    }
    public static boolean palindromeCheck(String str){
        boolean flag = false;
        String revString = new StringBuilder(str).reverse().toString();
        if(str.equals(revString)){
            flag = true;
        }
        return flag;
    }
}
