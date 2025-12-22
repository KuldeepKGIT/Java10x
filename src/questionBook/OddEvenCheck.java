package questionBook;

import java.util.Scanner;

public class OddEvenCheck {
    public static boolean oddEvenCheck(int num){

        return num%2==0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number!");
        int num = scanner.nextInt();
        if(oddEvenCheck(num)){
            System.out.println(num+" : is Even");
        }
        else {
            System.out.println(num+" : is Odd");
        }
    }
}
