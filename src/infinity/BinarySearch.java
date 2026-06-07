package infinity;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {3, 5, 2, 0, 1, 11, 9, 7};
        int target = 11;
        int result = binarySearch(array,target);
        if(result!=-1){
            System.out.println("Index of target: "+result);
        }
        else {
            System.out.println("Element not found!");
        }
    }

    public static int binarySearch(int[] array, int target){
        Arrays.sort(array);
        int left = 0;
        int right = array.length-1;

        while(left<=right){
            int mid = left+right/2;
            if(array[mid]==target){
                return mid;
            } else if (array[mid]<target) {
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }
        return -1;
    }
}
