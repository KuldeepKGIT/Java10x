package java250list;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks obtained.");
        if(!scanner.hasNextInt()){
            System.out.println("Enter a valid input");
            return;
        }
        int marks = scanner.nextInt();
        char grade;
        if(marks>90 && marks<=100){
            grade ='A';
        }
        else if (marks>80 && marks<=90) {
            grade= 'B';

        }
        else if (marks>70 && marks<=80) {
            grade = 'C';
        } else if (marks>60 && marks<=70) {
            grade = 'D';
        }
        else {
            grade ='F';
        }
        System.out.println("Your Grade is: "+ grade);

    }
}
