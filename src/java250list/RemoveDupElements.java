package java250list;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupElements {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,5,5,6,6};
        System.out.println("Without Duplicates: "+ Arrays.toString(removeDupElements(arr)));

    }
    public static Object[] removeDupElements(int[] array){
        Set<Integer> noDuplicates = new LinkedHashSet<>();
        for(int num : array){
            noDuplicates.add(num);
        }
        return noDuplicates.toArray();
    }
}
