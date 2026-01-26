package practiceQuestions;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        System.out.println("Reverse number is: "+reverseNumber(num));
    }
    public static int reverseNumber(int num){
        int rev = 0;
        while(num!=0){
            int temp = num%10;
            rev = 10*rev + temp;
            num = num/10;
        }
return rev;
    }
}
