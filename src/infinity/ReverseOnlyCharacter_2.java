package infinity;

import java.util.Arrays;

public class ReverseOnlyCharacter_2 {
    public static void main(String[] args) {
        String str = "aab1cba23fg7mnb";
        char[] strArr = str.toCharArray();
        int left = 0;
        int right = strArr.length-1;
        while(left<right){
            if(Character.isDigit(strArr[left])){
                left++;
            }
            else if(Character.isDigit(strArr[right])){
                right--;
            }
            else {
                char temp = strArr[left];
                strArr[left] = strArr[right];
                strArr[right]=temp;
                left++;
                right--;
            }
        }
        System.out.println("reversed: "+ Arrays.toString(strArr));
    }

}
