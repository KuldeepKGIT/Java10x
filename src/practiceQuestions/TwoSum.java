package practiceQuestions;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] numArr = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(numArr,target);
        if(result != null){
            System.out.println("Indices are: ["+result[0]+", "+result[1]+"]");
        }
        else {
            System.out.println("no such numbers found");
        }

    }
    public static int[] twoSum(int[] numArr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< numArr.length; i++){
            int complement = target - numArr[i];

            if(map.containsKey(complement)){
                return new int[] {i, map.get(complement)};
            }
            map.put(numArr[i], i );
        }
        return null;
    }
}
