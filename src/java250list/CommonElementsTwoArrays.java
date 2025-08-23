package java250list;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElementsTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 7, 9};
        int[] arr2 = {2, 3, 5, 6, 7, 10};
        System.out.println("Common Elements: "+ Arrays.toString(commonElementsArrays(arr1, arr2)));

    }
    public static Object [] commonElementsArrays(int[] array1, int[] array2){
        Set<Integer> set = new HashSet<>();
        Set<Integer> commonElements = new HashSet<>();
        for(int n1 : array1){
            set.add(n1);
        }
        for(int n2 : array2){
            if(set.contains(n2)){
                commonElements.add(n2);
            }
        }
        return commonElements.toArray();
     }
}
