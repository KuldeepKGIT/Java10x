package practiceQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class CountVowelsCons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String!");
        String str = scanner.nextLine().toLowerCase();
        System.out.println(Arrays.toString(countVowelCons(str)));
    }
    public static int[] countVowelCons(String str){
        int countV=0;
        int countC=0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
           if(ch>='a'&& ch<='z'){
               if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                   countV++;
               } else {
                   countC++;
               }
           }
        }
        return new int[]{countV,countC};
    }
}
