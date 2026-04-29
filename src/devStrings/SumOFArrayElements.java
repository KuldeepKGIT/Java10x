package devStrings;

public class SumOFArrayElements {
    public static void main(String[] args) {
        int[] array = {3, 5, 2, 0, 1, 11, 9, 7};
        int sum =0;
        for(int num : array){
            sum += num;
        }
        System.out.println("the sum of the elements is: "+sum);
    }
}
