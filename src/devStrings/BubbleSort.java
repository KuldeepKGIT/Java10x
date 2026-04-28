package devStrings;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {3, 5, 2, 0, 1, 11, 9, 7};
        System.out.println("Sorted: "+ Arrays.toString(bubbleSort(array)));

    }
    public static int[] bubbleSort(int[] array){
        int n= array.length;
        for(int i=0; i<n; i++){
            for(int j=0;j<n-i-1; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }
}
