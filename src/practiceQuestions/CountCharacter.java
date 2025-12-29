package practiceQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scanner.nextLine().toLowerCase();
        Map<Character, Integer> frequencyMap = new HashMap<>();
        char[] arrStr = str.toCharArray();
        for(char ch : arrStr){
            if(frequencyMap.containsKey(ch)){
                frequencyMap.put(ch,frequencyMap.get(ch)+1);
            }
            else {
                frequencyMap.put(ch,1);
            }
        }
        for(Map.Entry<Character, Integer> entry : frequencyMap.entrySet()){
            System.out.print(entry.getKey()+""+entry.getValue());
        }
    }
}
