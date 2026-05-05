package moneyMul;

import java.util.Arrays;

public class BubbleSort01 {
    public static void main(String[] args) {
        int[] arr = {8, 5, 2, 9, 6, 3};
        System.out.println("Sorted array is :"+ Arrays.toString(bubbleSort(arr)));

    }

    public static int[] bubbleSort(int[] arr){
        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
