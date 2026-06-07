package infinity;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scanner.nextLine();
        Map<Character,Integer> frequencyMap = countChar(str);
        for(Map.Entry<Character,Integer> entry : frequencyMap.entrySet()){
            System.out.print(entry.getKey()+""+entry.getValue());
        }

    }
    public static Map<Character,Integer> countChar(String str){
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        return map;
    }
}
