package practiceQuestions;

public class ReverseStringWithoutChangeSpace {
    public static void main(String[] args) {
        String str = "This is the java world!";
        System.out.println("reverse: "+ reverseString(str));
    }
    public static String reverseString(String str){

        String strRemoveSpace = str.replace("//s", "");
        StringBuilder reverse = new StringBuilder(strRemoveSpace).reverse();

        for(int i=0; i<=str.length()-1; i++){
            if(str.charAt(i)==' '){
                reverse.insert(i," ");
            }
        }
        return reverse.toString();
    }
}
