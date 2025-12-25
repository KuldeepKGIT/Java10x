package practiceQuestions;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lengths of the sides of the triangle");
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();
        if (side1 == side2 && side2 == side3){
            System.out.println("It is an equilateral Triangle");
        }
        else if(side1 == side2 || side2 == side3 || side3==side1){
            System.out.println(" It is an isosceles Triangle");
        }
        else {
            System.out.println("it is a scalene Triangle");
        }
    }
}
