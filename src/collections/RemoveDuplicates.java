package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,4,5,5,6,6));
        System.out.println("without duplicate: "+ removeDuplicates(list));
    }
    public static ArrayList<Integer> removeDuplicates(List<Integer> L){
        ArrayList<Integer> result = new ArrayList<>();
        for(int n : L){
            if (!result.contains(n)) {
                result.add(n);
            }
        }

        return result;
    }
}
