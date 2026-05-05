package moneyMul;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {3, 5, 2, 0, 1, 11, 9, 7};
        int target = 11;
        int result = binarySearch(array,target);
        if(result !=-1){
            System.out.println("Index of the target element is: "+result);
        }
        else {
            System.out.println("Element not found in the array!");
        }
    }
    public static int binarySearch(int[] arr, int target){
        int left=0;
        int right = arr.length-1;
        while(left<=right){
            int mid=(right+left)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }
}
