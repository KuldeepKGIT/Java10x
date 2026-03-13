package moneyMul;

public class ReverseEachWordOfSentence {
    public static void main(String[] args) {
        String str ="This is the Java World!";
        String str1 = str.replaceAll("\\s","");
        StringBuilder reverse = new StringBuilder(str1).reverse();
        for(int i=0; i<str.length(); i++){
            if (str.charAt(i) ==' ') {
                reverse.insert(i,' ');
            }
        }
        System.out.println("Reverse String with changing the spacing: "+reverse);
    }
}
