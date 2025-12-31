package practiceQuestions;

import java.util.*;

public class ReverseArraylist {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(4,2,6,1));
        Collections.reverse(list);
        System.out.println(list);
    }
}
