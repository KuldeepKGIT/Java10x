package java250list;

import java.util.Arrays;

public class FilterCharacters {
    public static void main(String[] args) {
        String str = "aBACbcEDed";
        System.out.println("Result: "+ Arrays.toString(filterCharacters(str)));
    }
    public static String[] filterCharacters(String str){
        char[] strArr = str.toCharArray();
        Arrays.sort(strArr);
        StringBuilder lowerCase = new StringBuilder();
        StringBuilder upperCase = new StringBuilder();
        for(char ch: strArr){
            if (ch >= 'A' && ch <= 'Z') {
                upperCase.append(ch);
            }
            else if (ch >= 'a' && ch <= 'z') {
               lowerCase.append(ch);
            }
        }
        return new String[]{lowerCase.toString(),upperCase.toString()};
    }
}
