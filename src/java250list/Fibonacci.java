package java250list;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to set the length of the series");
        int n = scanner.nextInt();
        int first = 0;
        int second = 1;

        for(int i = 0; i<n; i++){
            System.out.print(first+ " ");
            int next = second + first;
            first = second;
            second = next;
        }
    }
}
