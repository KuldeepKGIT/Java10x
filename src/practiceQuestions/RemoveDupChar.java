package practiceQuestions;

import java.util.Scanner;

public class RemoveDupChar {
    public static String removeDupChar(String str){
        StringBuilder noDuplicates = new StringBuilder();
        char[] arrStr = str.toCharArray();
        for(char ch : arrStr){
            if(noDuplicates.indexOf(String.valueOf(ch))==-1){
                noDuplicates.append(ch);
            }
        }
        return noDuplicates.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scanner.nextLine();
        System.out.println("Without Duplicates String: "+removeDupChar(str));
    }
}
