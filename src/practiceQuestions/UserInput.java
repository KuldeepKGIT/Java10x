package practiceQuestions;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello " +name+". you are "+age+" years old!");

    }
}
