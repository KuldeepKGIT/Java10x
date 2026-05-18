package devStrings;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Strings");
        String str1 = scanner.nextLine().toLowerCase();
        String str2 = scanner.nextLine().toLowerCase();
        if(anagramCheck(str1,str2)){
            System.out.println("Strings are Anagram in nature!");
        }
        else {
            System.out.println("Strings are not Anagram in nature!");
        }


    }
    public static boolean anagramCheck(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] arrS1 = s1.toCharArray();
        char[] arrS2 = s2.toCharArray();
        Arrays.sort(arrS1);
        Arrays.sort(arrS2);

        return Arrays.equals(arrS1,arrS2);
    }
}
