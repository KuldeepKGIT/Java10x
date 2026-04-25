package moneyMul;

import java.util.Arrays;

public class LargestAndSmallest {
    public static void main(String[] args) {
        int[] arr = {8,5,2,9,6,3};
        Arrays.sort(arr);
        System.out.println("Smallest Element is:"+arr[0]);
        System.out.println("Largest Element is:"+arr[arr.length-1]);
        System.out.println("Second largest is : "+arr[arr.length-2]);
    }
}
