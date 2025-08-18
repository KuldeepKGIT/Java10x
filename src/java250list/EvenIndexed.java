package java250list;

import java.util.Scanner;

public class EvenIndexed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scanner.nextLine();
        for(int i=0; i<str.length(); i++){
            if(i%2==0){
                System.out.print(str.charAt(i)+" ");
            }
        }
        scanner.close();
    }
}
