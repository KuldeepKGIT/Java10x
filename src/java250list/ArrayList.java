package java250list;


import java.util.Arrays;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<Integer> list = new java.util.ArrayList<>(Arrays.asList(2, 3, 5, 6, 7, 10));
        System.out.println(list.getFirst()+"\n"+list.getLast());
    }
}
