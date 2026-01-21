package practiceQuestions;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static String longestSubString(String str){
        int maxLength = 0;
        int startIndex =0;
        int left =0;
        Set<Character> set = new HashSet<>();
        for(int right=0; right<str.length(); right++){
            if(set.contains(str.charAt(right))){
                set.remove(str.charAt(right));
                left++;
            }
            set.add(str.charAt(right));
            if(right-left+1>maxLength){
                maxLength = right-left+1;
                startIndex = left;
            }
        }
        return str.substring(startIndex,startIndex+maxLength);

    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(longestSubString(str));
    }
}
