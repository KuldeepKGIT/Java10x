package practiceQuestions;

public class SumOfElements {
    public static void main(String[] args) {
        int[] numbers ={12, 34, 10, 1};
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        System.out.println("Sum of all the elements of the array is: "+sum);
    }
}
