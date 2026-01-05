package practiceQuestions;

public class CountWordsInString {
    public static void main(String[] args) {
        String str = "Hello world! Welcome to Java.";
        String[] strArr = str.split("\\s");
        int count = strArr.length;
        System.out.println("Number of words in the Array: "+count);

    }
}
