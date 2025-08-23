package java250list;

import java.util.Arrays;

public class RemoveDupManual {
    public static void main(String[] args) {
        int[] arr = {7, 3, 1, 9, 3, 5, 7, 2, 8, 1, 4};
        int[] uniqueArr = removeDup(arr);
        System.out.println("Original arr"+ Arrays.toString(arr));
        System.out.println("Without duplicates: "+ Arrays.toString(uniqueArr));
    }
    public static int[] removeDup(int[] array){
        Arrays.sort(array);
        int n = array.length;
        int[] temp = new int[n-1];
        int j=0;
        for(int i=0; i<n-1; i++){
            if(array[i]!=array[i+1]){
                temp[j++] = array[i];
            }
        }
        temp[j++] = array[n-1]; //adding last Element

        return Arrays.copyOf(temp,j);
    }
}
