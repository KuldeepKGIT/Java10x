package questionBook;

import java.util.Scanner;

public class RemoveDuplicateCh {
    public static String removeDuplicateCh(String str){
        StringBuilder result = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(result.toString().indexOf(str.charAt(i))==-1){
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scanner.nextLine();
        System.out.println("String after removing duplicate character: "+ removeDuplicateCh(str));
    }
}
