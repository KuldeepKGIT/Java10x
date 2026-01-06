package practiceQuestions;
public class FirstLetterOfWords {
    public static void main(String[] args) {
        String str = "Hello World from Java";
        StringBuilder nStr = new StringBuilder();
        String[] strArr = str.split("\\s");
        for(String s : strArr){
            nStr.append(s.charAt(0));
        }
        System.out.println(nStr);
    }
}
