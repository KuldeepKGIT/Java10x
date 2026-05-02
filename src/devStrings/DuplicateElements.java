package devStrings;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 1, 2};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for(int num : numbers){
            if(!seen.add(num)){
                duplicates.add(num);
            }
        }
        System.out.println("Duplicate Elements in the array: "+duplicates);
    }
}
