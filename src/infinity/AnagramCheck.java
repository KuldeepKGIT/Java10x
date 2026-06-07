package infinity;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Strings!");
        String str1 = scanner.nextLine().toLowerCase();
        String str2 = scanner.nextLine().toLowerCase();
        if (anagramCheck(str1, str2)) {
            System.out.println("Strings are anagram");
        }
        else {
            System.out.println("Strings are not anagram");
        }

    }
    public static boolean anagramCheck(String str1, String str2){
        if(str1.length() !=str2.length()){
            return false;
        }
        char[] strArr1 = str1.toCharArray();
        char[] strArr2 = str2.toCharArray();
        Arrays.sort(strArr1);
        Arrays.sort(strArr2);
        return Arrays.equals(strArr1,strArr2);

    }
}
