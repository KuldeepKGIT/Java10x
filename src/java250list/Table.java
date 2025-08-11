package java250list;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        for(int i=1; i<=10; i++){
            int result = n * i;
            System.out.printf("%d x %d = %d",n,i,result);
            System.out.println();
        }
        scanner.close();
    }
}
