package infinity;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountElementFrequency {
    public static void main(String[] args) {
        int[] array = {1,1,1,1,3,3,3,3,3,0,0,5,5,5,};
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int num : array){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else {
                map.put(num, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+"-"+ entry.getValue());
        }
    }
}
