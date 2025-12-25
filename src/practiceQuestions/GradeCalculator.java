package practiceQuestions;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Marks!");
        int marks = scanner.nextInt();
        char grade;
        if (marks < 0 || marks > 100) {
            System.out.println("Enter the valid marks");
            return;
        }
        if (marks>90) {
            grade = 'A';
        }
        else if (marks>80) {
            grade = 'B';
        } else if (marks>70) {
            grade = 'C';
        }
        else if (marks>60) {
            grade = 'D';
        }
        else {
            grade ='F';
        }
        System.out.println("Your Grade is: "+grade);

    }

}
