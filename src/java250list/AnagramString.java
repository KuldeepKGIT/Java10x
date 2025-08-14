package java250list;
import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String[] words = {"listen", "silent", "hello", "world"};
        boolean flag = true;
       for(int i=1; i<words.length; i++){
           if(!anagramCheck(words[0],words[i])){
               flag = false;
               break;
           }
       }
       if(!flag){
           System.out.println("No Anagram");
       }
       else {
           System.out.println("Array has Anagram Strings");
       }
    }
    public static boolean anagramCheck(String s1, String s2){
        boolean isAnagram = true;
        char[] s1Arr = s1.toLowerCase().toCharArray();
        char[] s2Arr = s2.toLowerCase().toCharArray();
        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);
        if(!Arrays.equals(s1Arr,s2Arr)){
            isAnagram = false;
        }
        return isAnagram;
    }
}
