package devStrings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDupCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scanner.nextLine();
        System.out.println("String with duplicate characters: "+removeDup(str));

    }
    public static String removeDup(String str){
        Set<Character> set = new HashSet<>();
        for(int i=0; i<str.length(); i++){
            set.add(str.charAt(i));
        }
        StringBuilder updated = new StringBuilder();
        for(char ch : set){
            updated.append(ch);
        }

        return updated.toString();
    }
}
