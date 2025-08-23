package java250list;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString01 {
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(longestSubString(str));
    }
    public static String longestSubString(String str){
        int left = 0;
        int startIndex = 0;
        int maxLength = 0;
        int n = str.length();
        Set<Character> set = new HashSet<>();
       for(int right =0; right<n; right++){
           char ch = str.charAt(right);
           while(set.contains(ch)){
               set.remove(ch);
               left++;
           }
           set.add(ch);
           if(right-left+1 > maxLength){
               maxLength = right-left+1;
               startIndex = left;
           }

       }
       return str.substring(startIndex,startIndex+maxLength);
    }
}
