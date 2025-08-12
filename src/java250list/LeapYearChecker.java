package java250list;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year");
        if(!scanner.hasNextInt()){
            System.out.println("Enter a valid input");
            return;
        }
        int year = scanner.nextInt();
        boolean flag = false;
        if((year%4==0 && year%100 !=0)|| year%400==0){
            flag = true;
        }
        if(flag){
            System.out.println(year+" is a leap year");
        }
        else {
            System.out.println(year+" is not a leap year");
        }
        scanner.close();
    }

}
