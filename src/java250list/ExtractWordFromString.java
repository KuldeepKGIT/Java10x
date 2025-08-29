package java250list;

import java.util.Scanner;

public class ExtractWordFromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = "This is a bird";
        System.out.println("Enter a word to extract");
        String str = scanner.nextLine();
        int y = sentence.indexOf(str);
        System.out.println(y);
        String u = sentence.substring(y,y+str.length());
        System.out.println("Extracted word: "+u);
    }
}
