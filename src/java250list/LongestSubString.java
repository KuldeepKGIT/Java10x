package java250list;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println("maximum Length of longest substring without repeating characters: "+longestSubString(str));
    }
    public static int longestSubString(String str){
        int left =0;
        int maxLength = 0;

        Set<Character> set = new HashSet<>();
        for(int right=0; right<str.length(); right++){
            if(set.contains(str.charAt(right))){
                set.remove(str.charAt(right));
                left++;
            }
            set.add(str.charAt(right));
            maxLength = Math.max(maxLength,right-left+1);
        }
        return maxLength;

    }
}
