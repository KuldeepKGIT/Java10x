package practiceQuestions;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scanner.nextLine();
        System.out.println("reverse string is: "+revString(str));
        scanner.close();

    }
    public static String revString(String str){
        StringBuilder reverse = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            reverse.append(ch);

        }
        return reverse.toString();
    }
}
