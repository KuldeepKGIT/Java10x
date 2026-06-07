package infinity;

import java.util.Arrays;

public class AnagramCheck03 {
    public static void main(String[] args) {
        String[] words = {
                "listen",
                "silent",
                "hello",
                "enlist",
                "world"
        };
        for(int i=0; i<words.length; i++){
            for(int j=i+1; j<words.length; j++){
                if(anagramCheck(words[i],words[j] )){
                    System.out.println("Pairs of Anagram Strings: "+ words[i]+", "+words[j]);
                }
            }
        }
    }
    public static boolean anagramCheck(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char[]sArr1 =s1.toCharArray();
        char[] sArr2 = s2.toCharArray();
        Arrays.sort(sArr1);
        Arrays.sort(sArr2);
        return Arrays.equals(sArr1,sArr2);
    }
}
