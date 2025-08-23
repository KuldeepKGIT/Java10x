package java250list;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr = {7, 3, 1, 9, 3, 5, 7, 2, 8, 1, 4};
        System.out.println("Common elements in the Array: "+commonElements(arr));
    }
    public static Set<Integer> commonElements(int[] array){
        Set<Integer> set = new HashSet<>();
        Set<Integer> common = new HashSet<>();
        for(Integer num : array){
            if(!set.add(num)){
                common.add(num);
            }
        }
        return common;
    }
}
