package infinity;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] numbers = {2, 2, 3, 4, 5, 5, 5, 3, 2, 4};
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int n:numbers){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+"-"+ entry.getValue());
        }
    }
}
