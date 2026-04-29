package devStrings;

import java.util.HashMap;
import java.util.Map;

public class CountElementFrequency {
    public static void main(String[] args) {
        int[] array = {1,1,1,1,3,3,3,3,3,0,0,5,5,5,};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : array){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.print(entry.getKey()+""+ entry.getValue()+" ");
        }
    }
}
