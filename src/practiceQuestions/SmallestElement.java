package practiceQuestions;

public class SmallestElement {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1};
        int min = numbers[0];
        for(int num : numbers){
            if(min>num){
                min = num;
            }
        }
        System.out.println("Smallest number from the array: "+ min);
    }
}
