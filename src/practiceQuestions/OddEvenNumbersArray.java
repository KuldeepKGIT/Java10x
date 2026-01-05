package practiceQuestions;

public class OddEvenNumbersArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        System.out.print("Even numbers: ");
        for(int num : numbers){
            if(num%2==0){
                System.out.print(num+" ");
            }
        }
        System.out.print("\nOdd numbers: ");
        for(int num : numbers){
            if(num%2!=0){
                System.out.print(num+" ");
            }
        }
    }
}
