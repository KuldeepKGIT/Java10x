package java250list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterator {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Welcome");
        set.add("to");
        set.add("Geek");
        set.add("for");
        set.add("Geeks");
        System.out.println("Set: "+ set);
        Iterator<String> value = set.iterator();
        System.out.println("The values of iterator:");
        while (value.hasNext()){
            System.out.println(value.next());
        }
    }
}
