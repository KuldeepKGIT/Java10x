package practiceQuestions;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1= "Listen";
        String s2 = "Silent";
        if(anagramCheck(s1,s2)){
            System.out.println("Strings are Anagram");
        }
        else {
            System.out.println("Strings are not Anagram");
        }

    }
    public static boolean anagramCheck(String str1, String str2){
        boolean flag = false;
        char[] arrStr1 = str1.toLowerCase().toCharArray();
        Arrays.sort(arrStr1);
        char[] arrStr2 = str2.toLowerCase().toCharArray();
        Arrays.sort(arrStr2);
        if(Arrays.equals(arrStr1,arrStr2)){
            flag = true;
        }
        return flag;
    }
}
