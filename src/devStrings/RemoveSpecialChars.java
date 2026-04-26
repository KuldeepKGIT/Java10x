package devStrings;

import java.util.Scanner;

public class RemoveSpecialChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string!");
        String str = scanner.nextLine();
        String result = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("Output String is: "+result);
        scanner.close();
    }
}
