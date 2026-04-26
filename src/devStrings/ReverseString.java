package devStrings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scanner.nextLine();
        System.out.println("Original: "+ str);
        System.out.println("Reverse: " + revString(str));
    }
    public static String revString(String str){
         return new StringBuilder(str).reverse().toString();

    }
}
