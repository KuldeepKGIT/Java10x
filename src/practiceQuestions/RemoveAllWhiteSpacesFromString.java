package practiceQuestions;

public class RemoveAllWhiteSpacesFromString {
    public static void main(String[] args) {
        String str = " Geeks for Geeks ";
        String nStr= str.replaceAll("\\s","");
        System.out.println("String with out spaces in between: "+nStr);
    }
}
