package devStrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EvenOddExtraction {
    public static void main(String[] args) {
        int[] array = {3, 5, 2, 0, 1, 11, 9, 7};
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for(int num : array){
            if(num%2==0){
              even.add(num);
            }
            else{
                odd.add(num);
            }
        }
        System.out.println("Even numbers from Array are : "+even);
        System.out.println("Odd numbers from Array are: "+odd);

    }
}
