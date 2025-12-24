package practiceQuestions;


import java.util.Scanner;

public class PalindromeStringCheck {
    public static boolean palindromeCheck(String str){
        boolean flag = false;
        char[] strArr = str.toCharArray();
        StringBuilder reverse = new StringBuilder();
        for(char ch : strArr){
            reverse.append(ch);
        }
        reverse.reverse();
        if(str.contentEquals(reverse)){
            flag = true;
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Input!");
        String str = scanner.nextLine().toLowerCase();
        if(palindromeCheck(str)){
            System.out.println(str+" : is a palindrome");
        }
        else {
            System.out.println(str+" : is not a palindrome");
        }
    }
}
