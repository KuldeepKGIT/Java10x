package devStrings;

import java.util.Arrays;

public class EqualityOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 4, 3};
        boolean result = Arrays.equals(arr1,arr2);
        System.out.println("the Arrays are equal:"+result);
    }
}
