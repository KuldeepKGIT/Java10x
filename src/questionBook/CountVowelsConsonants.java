package questionBook;

import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scanner.nextLine().toLowerCase();
        int vCount = 0;
        int cCount = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vCount++;
            }
            else if(ch>='a' && ch<='z'){
                cCount++;
            }
        }
        System.out.println("Vowel count in the String: "+vCount);
        System.out.println("Consonants count in the String: "+cCount);
    }

}
