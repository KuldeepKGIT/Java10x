package infinity;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to fix the elements in the Series");
        int n = scanner.nextInt();
        int first = 0;
        int second = 1;
        for(int i=0; i<n; i++){
            System.out.print(first+", ");
            int next = second + first;
            first = second;
            second = next;
        }
    }
}
