package java250list;

import java.util.*;
import java.util.ArrayList;

public class NoDupArrayList {
    public static void main(String[] args) {
        int[] arr = {7, 3, 1, 9, 3, 5, 7, 2, 8, 1, 4};
        List<Integer> list = new ArrayList<>();
        for(int num : arr){
            list.add(num);
        }
        System.out.println("Original: "+list);
        System.out.println("Removing duplicates: "+noDupList(list));
    }
    public static List<Integer> noDupList(List<Integer> list){
        Set<Integer> setList = new LinkedHashSet<>();
        setList.addAll(list);
        return new ArrayList<>(setList);
    }
}
