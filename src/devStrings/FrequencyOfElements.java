package devStrings;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] numbers = {2, 2, 3, 4, 5, 5, 5, 3, 2, 4};
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : numbers){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.print(entry.getKey()+""+ entry.getValue()+" ");
        }
    }
}
