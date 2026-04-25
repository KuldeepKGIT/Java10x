package moneyMul;

import java.util.Scanner;

public class RemoveSpecialChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scanner.nextLine();
       String result = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("Updated String is: "+result);
    }
}
