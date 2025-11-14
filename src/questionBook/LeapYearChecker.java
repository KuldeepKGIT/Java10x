package questionBook;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeapYearChecker {
    public static boolean leapYearChecker(int year){

        return (year%4==0 && year%100!=0) || (year%400==0);
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a Year!");
            int year = scanner.nextInt();
            if(year<0){
                System.out.println("please input a positive number");
                return;
            }
            if(leapYearChecker(year)){
                System.out.println(year+" is a leap year");
            }
            else {
                System.out.println(year+" is not a leap year");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid integer year.");
        }
    }
}
