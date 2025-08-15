package java250list;

import java.util.Scanner;

public class DigitInNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        int count =0;
        if(num<0){
            System.out.println("Enter a value greater than zero");
        }
        if(num>0){
            while(num!=0){
               num= num/10;
               count++;
            }
            System.out.println("Number of digits in "+num +" : "+count);
        }
    }
}
