package questionBook;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String to check Palindrome");
        String str = scanner.nextLine().toLowerCase();
        StringBuilder rts = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            rts.append(str.charAt(i));
        }
       String rstr = rts.reverse().toString();
        if(str.equals(rstr)){
            System.out.println(str+" is a palindrome");
        }
        else {
            System.out.println(str+" is not a palindrome");
        }
    }
}
