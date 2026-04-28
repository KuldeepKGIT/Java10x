package devStrings;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 5};
        int n = 5;
        int sumExpected = n*(n+1)/2;
        int actualSum = 0;
        for(int num : arr){
            actualSum += num;
        }
        System.out.println("Missing number is: " + (sumExpected-actualSum));
    }
}
