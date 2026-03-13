package moneyMul;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String!");
        String Str = scanner.nextLine().toLowerCase();
        System.out.println("Reverse String: "+ reverseString(Str));
    }
    public static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
