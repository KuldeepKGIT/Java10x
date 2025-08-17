package java250list;

public class CountWords {
    public static void main(String[] args) {
        String str = "Java program to count the number of words in a string ";
        System.out.println("Count of words in the string: " + countWords(str));
    }
    public static int countWords(String str){
        String[] words = str.split(" ");
        return words.length;
    }
}
