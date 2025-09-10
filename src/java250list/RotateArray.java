package java250list;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int n = array.length;
        int k =3;
        reverse(array,0,n-1); // Reverse full array
        System.out.println(Arrays.toString(array));
        reverse(array,0,n-k-1);
       reverse(array,k+1,n-1);
        System.out.println(Arrays.toString(array));

    }
       public static void reverse(int[] array, int start, int end){
        while(start<end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
       }
    }

