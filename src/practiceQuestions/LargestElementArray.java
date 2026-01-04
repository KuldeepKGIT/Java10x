package practiceQuestions;

public class LargestElementArray {
    public static void main(String[] args) {
        int[] arr = {12, 34, 10, 1};
        int max = 0;
        for(int i=0; i< arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Largest Element from the Array: "+ max);
    }

}
