package java250list;

import java.util.Scanner;

public class twiceCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scanner.nextLine();
        System.out.println("Each letter twice in the string: ");
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" "+ str.charAt(i)+" ");
        }
    }
}
