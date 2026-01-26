package practiceQuestions;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1,1,2,3,3,4,5};
        System.out.println("Elements: "+removeDuplicates(numbers));

    }
    public static int removeDuplicates(int[] numbers){
        Set<Integer> set = new HashSet<>();
        for(int n : numbers)
        {
            set.add(n);
        }
        return set.size();
    }
}
