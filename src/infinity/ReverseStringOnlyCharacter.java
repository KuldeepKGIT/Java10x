package infinity;

public class ReverseStringOnlyCharacter {
    public static void main(String[] args) {
        String str = "aab1cba23fg7mnb";
        StringBuilder letters = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(!Character.isDigit(ch)) {
                letters.append(ch);
            }
        }
        letters.reverse();
        StringBuilder result = new StringBuilder();
        int letterIndex =0;
        for(char ch : str.toCharArray()){
            if (Character.isLetter(ch)) {
                result.append(letters.charAt(letterIndex++));
            }
            else {
                result.append(ch);
            }
        }
        System.out.println("original : "+str);
        System.out.println("reversed : "+ result);
    }
}
