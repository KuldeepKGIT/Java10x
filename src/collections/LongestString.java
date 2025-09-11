package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("John", "Alice", "Bob","kuldeep"));
        System.out.println("Longest String in the ArrayList is: "+longestString(list));
    }
    public static String longestString(List<String> list){
        String longest = "";
        for(int i=0; i< list.size()-1; i++){
            int temp = list.get(i).length();
            longest = list.get(i);
            if(temp<list.get(i+1).length()){
              longest = list.get(i+1);
            }
        }
        return longest;
    }
}
