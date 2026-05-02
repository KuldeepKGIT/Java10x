package devStrings;

import java.util.Arrays;

public class RotateElements01 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        reverse(numbers,0, numbers.length-1);
        reverse(numbers,0,1);
        reverse(numbers,2, numbers.length-1);
        System.out.println(Arrays.toString(numbers));

    }
    public static void reverse(int[] numbers, int start , int end){
        while(start<end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }
}
