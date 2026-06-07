package infinity;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {3, 5, 2, 0, 1, 11, 9, 7};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }
    public static  void bubbleSort(int[] arr){
        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
