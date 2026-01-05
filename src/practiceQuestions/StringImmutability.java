package practiceQuestions;

public class StringImmutability {
    public static void main(String[] args) {
        String str = "Hello";
        //Attempt to change the String
        str.concat(", world!");

        //Original String remains Unchanged.
        System.out.println("Result string: "+ str);
    }
}
