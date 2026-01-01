package practiceQuestions;

import java.util.*;

public class MostFrequentElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4));
        System.out.println("The Most frequent Element in the List is: "+ mostFrequentElement(list));

    }
    public static int mostFrequentElement(List<Integer> list){
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int n : list){
            frequencyMap.put(n,frequencyMap.getOrDefault(n,0)+1);
        }
        return Collections.max(frequencyMap.entrySet(),Map.Entry.comparingByValue()).getKey();
    }
}
