package java250list;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scanner.nextLine().toLowerCase();
        Map<String, Integer> map = new HashMap<>();
        int[] count = countVowels(str);
            map.put("Vowel Count", count[0]);
            map.put("Consonant count", count[1]);
        System.out.println(map);
    }
    public static int[] countVowels(String str){
        int cCount = 0;
        int vCount = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u') {
                vCount++;
            }
            else if (ch >='a' && ch<='z'){
                cCount++;
            }
        }
        return new int[]{vCount, cCount};
    }
}
