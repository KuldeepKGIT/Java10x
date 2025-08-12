package java250list;

import java.util.Arrays;
import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String!");
        String str = scanner.nextLine().toLowerCase();
        System.out.println(str+": contains the number of Vowels and consonants "+ Arrays.toString(countChar(str)));
    }
    public static int[] countChar(String str){
        int cCount = 0;
        int vCount = 0;

        for(int i=0; i<str.length()-1; i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vCount++;

            } else if (ch>'a'&& ch<='z') {
                cCount++;
            }
        }
        return new int[]{vCount,cCount};
    }
}
