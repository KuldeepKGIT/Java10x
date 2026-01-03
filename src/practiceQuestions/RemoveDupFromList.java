package practiceQuestions;

import java.util.*;

public class RemoveDupFromList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "apple"));
        Set<String> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);
        System.out.println(list);


    }
}
