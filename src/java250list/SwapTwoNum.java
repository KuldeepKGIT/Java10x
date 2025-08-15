package java250list;

import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        System.out.println("value of a: "+a);
        System.out.println("value of b: "+b);

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Swapped value of a: "+ a);
        System.out.println("Swapped value of b: "+ b);
    }
}
