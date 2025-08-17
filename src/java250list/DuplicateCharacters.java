package java250list;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scanner.nextLine().toLowerCase();
        char[] strArr = str.toCharArray();
        Set<Character> seen = new HashSet<>();
        Set<Character> duplicate = new HashSet<>();
        for(char ch : strArr){
            if(!seen.add(ch)){
                duplicate.add(ch);
            }
        }
        System.out.println(duplicate);
    }
}
