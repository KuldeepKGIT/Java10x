package questionBook;

import java.util.Scanner;

public class ReverseAnyString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scanner.nextLine().toLowerCase();
        StringBuilder nStr = new StringBuilder();
        nStr.append(str);
        nStr.reverse();
        System.out.println("Original String: "+ str);
        System.out.println("Reverse String: "+ nStr);
    }
}
