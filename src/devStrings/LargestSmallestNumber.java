package devStrings;

import java.util.Arrays;

public class LargestSmallestNumber {
    public static void main(String[] args) {
        int[] array = new int[8];
        array[0]= 3;
        array[1] = 5;
        array[2] = 2;
        array [3] = 0;
        array[4]=1;
        array[5]=11;
        array[6]=9;
        array[7]=7;
        System.out.println("original array: "+ Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Smallest Element is: "+array[0]+"\nLargest Element is: "+array[7]);
    }
}
