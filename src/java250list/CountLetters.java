package java250list;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = scanner.nextLine();
        System.out.println(countLetters(input));

    }
    public static Map<Character,Integer>  countLetters(String str){
        char[] strArr = str.toCharArray();
        Map<Character,Integer> frequencyMap = new HashMap<>();
        for(Character ch : strArr){
            if(frequencyMap.containsKey(ch)){
                frequencyMap.put(ch, frequencyMap.get(ch)+1);
            }
            else {
                frequencyMap.put(ch,1);
            }
        }
return frequencyMap;
    }
}
