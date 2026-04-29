package devStrings;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        int rev = 0;
        int temp = num;
        while(temp!=0){
           rev = (rev*10)+temp%10;
           temp = temp/10;

        }
        System.out.println("the original number is: "+num);
        System.out.println("the reverse number is : "+rev);
    }
}
