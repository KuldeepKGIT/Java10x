package questionBook;

import java.util.Arrays;

public class AnagramCheck {
    public static boolean anagramCheck(String s1, String s2){
        boolean isAnagram = false;
        char[] s1Arr = s1.toLowerCase().toCharArray();
        char[] s2Arr = s2.toLowerCase().toCharArray();
        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);
        if(Arrays.equals(s1Arr,s2Arr)){
            isAnagram = true;
        }
        return isAnagram;
    }

    public static void main(String[] args) {
        String[] strings = {"listen", "silent", "hello", "world"};
        boolean flag = true;
        for(int i=1; i<strings.length; i++){
            if(!anagramCheck(strings[0],strings[i] )){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Strings a anagram");
        }
        else {
            System.out.println("Strings are not anagram");
        }
    }
}
