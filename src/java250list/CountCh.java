package java250list;

import java.util.HashMap;
import java.util.Map;

public class CountCh {
    public static void main(String[] args) {
        String str = "aabbcccdd";
        System.out.print("Output: ");
        countCh(str);
    }
    public static void countCh (String str){
        char[] strArr = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : strArr){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            System.out.print(entry.getKey()+""+entry.getValue());
        }
    }
}
