package questionBook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharacters {
public static void countCh(String str){
    char[] arrStr = str.toCharArray();
    Map<Character,Integer> map = new HashMap<>();
    for(char ch : arrStr){
        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }
        else {
            map.put(ch,1);
        }
    }
    for(Map.Entry<Character,Integer> entry : map.entrySet()){
        System.out.print(entry.getKey()+""+entry.getValue());
    }

}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entry a String");
        String str = scanner.nextLine().toLowerCase();
        countCh(str);
    }
}
