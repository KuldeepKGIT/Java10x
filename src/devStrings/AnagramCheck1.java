package devStrings;

import java.util.Arrays;

public class AnagramCheck1 {
    public static void main(String[] args) {
        String[] words = {"listen", "silent", "hello", "world"};
        boolean flag = false;
        for(int i=1; i< words.length; i++){
            if(anagramCheck(words[0],words[i] )){
                flag = true;
            }
        }
        if(flag){
            System.out.println("String Elements in the Array are Anagram!");
        }
        else {
            System.out.println("String Elements in the Array are not Anagram!");
        }

    }
    public static boolean anagramCheck(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] arrS1 = s1.toCharArray();
        char[] arrS2 = s2.toCharArray();
        Arrays.sort(arrS1);
        Arrays.sort(arrS2);
        return Arrays.equals(arrS1,arrS2);
    }
}
