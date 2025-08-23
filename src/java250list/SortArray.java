package java250list;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
int[] arr = {7, 3, 1, 9, 3, 5, 7, 2, 8, 1, 4};
        System.out.println(Arrays.toString(sortArray(arr)));
    }
    public static int[] sortArray(int[] array){
        int temp;
        int n = array.length-1;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                if(array[j]>array[j+1]){
                    temp = array[j];
                    array[j] =array[j+1];
                    array[j+1]=temp;

                }
            }
        }
        return array;
    }
}
