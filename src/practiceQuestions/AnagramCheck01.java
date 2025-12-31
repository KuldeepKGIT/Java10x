package practiceQuestions;

import java.util.Arrays;

public class AnagramCheck01 {
    public static void main(String[] args) {
        String[] words = {"silent", "listen", "enlist", "inlets"};
        boolean flag = true;
        for(int i=1; i<words.length; i++){
            if(!anagramCheck(words[0],words[i])){
               flag = false;
               break;
            }
        }
        if(flag){
            System.out.println("Strings in the Array are anagram");
        }
        else {
            System.out.println("Strings in the Array are not anagram");
        }
    }
    public static boolean anagramCheck(String str1, String str2){
        boolean flag = false;
        if(str1.length()!=str2.length()){
            return false;
        }
        char[] arrStr1 = str1.toCharArray();
        char[] arrStr2 = str2.toCharArray();
        Arrays.sort(arrStr1);
        Arrays.sort(arrStr2);
        if(Arrays.equals(arrStr1,arrStr2)){
            flag = true;
        }
        return flag;
    }

}
