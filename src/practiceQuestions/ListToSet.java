package practiceQuestions;

import java.util.*;

public class ListToSet {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "apple"));
        Set<String> set = new HashSet<>(list);
        System.out.println(list);
        System.out.println(set);
    }
}
