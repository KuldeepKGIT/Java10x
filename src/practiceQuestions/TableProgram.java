package practiceQuestions;

import java.util.Scanner;

public class TableProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to print its table");
        int num = scanner.nextInt();
        int result;
        for(int i=1; i<=10; i++){
            result = num * i;
            System.out.printf("%d x %d = %d %n",num,i,result);

        }
    }
}
