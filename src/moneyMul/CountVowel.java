package moneyMul;

import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String!");
        String str = scanner.nextLine().toLowerCase();
        int vCount = 0;
        for(int i=0; i<str.length(); i++){
            char  ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vCount++;
            }
        }
        System.out.println("The vowel count in the string is: "+vCount);

    }
}
