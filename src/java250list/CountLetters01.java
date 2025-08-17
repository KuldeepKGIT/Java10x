package java250list;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountLetters01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String string = scanner.nextLine().toLowerCase();
        char[] strArr = string.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(Character ch : strArr){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
