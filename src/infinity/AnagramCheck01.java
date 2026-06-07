package infinity;

import java.util.Arrays;

public class AnagramCheck01 {
    public static void main(String[] args) {
        String[] words = {"listen", "silent", "hello", "world"};
        boolean flag = true;
        for(int i=1; i< words.length; i++){
            if(anagramCheck(words[0],words[i])){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("String elements in the array are Anagram");
        }
        else {
            System.out.println("String elements in the array are not Anagram");
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
