package moneyMul;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String str ="Programming";
        char[] strArr = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : strArr){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                System.out.println("first non repeated character: "+entry.getKey());
                break;
            }
        }
    }
}
