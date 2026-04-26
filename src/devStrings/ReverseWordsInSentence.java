package devStrings;

public class ReverseWordsInSentence {
    public static void main(String[] args) {
        String str ="This is the Java World!";
        String updatedStr = str.replaceAll(" ","");
        StringBuilder revUpdated = new StringBuilder(updatedStr).reverse();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==' '){
                revUpdated.insert(i,' ');
            }
        }
        System.out.println("Output String is: "+revUpdated);

    }
}
