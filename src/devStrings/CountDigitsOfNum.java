package devStrings;

import java.util.Scanner;

public class CountDigitsOfNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = scanner.nextInt();
        int count = String.valueOf(num).length();
        System.out.println("Digits in num:"+ count);

    }
}
