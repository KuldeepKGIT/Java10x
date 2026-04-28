package devStrings;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] array = {3, 5, 2, 0, 1, 11, 9, 7};
        Arrays.sort(array);
        System.out.println("Second largest element in the Array is: "+array[array.length-2]);
    }
}
