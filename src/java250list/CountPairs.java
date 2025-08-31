package java250list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountPairs {
    public static void main(String[] args) {
        int[] arr = {1, 9, 10, 9, 1, 10};

        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int n : arr){
            freqMap.put(n,freqMap.getOrDefault(n,0)+1);
        }
        System.out.println("frequency: "+ freqMap);

        ArrayList<Integer> keys = new ArrayList<>(freqMap.keySet());
        ArrayList<String> pairs = new ArrayList<>();
        for(int i=0; i< keys.size(); i++){
            for(int j=i+1; j< keys.size(); j++){
               int a = keys.get(i);
               int b = keys.get(j);
               if(freqMap.get(a)+freqMap.get(b) ==4){
                   pairs.add("("+a+", "+b+")");
               }

            }
        }
        System.out.println("Pairs with sum of counts = 4:"+pairs);
    }

}
