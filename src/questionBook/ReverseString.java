package questionBook;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Geeks";
                StringBuilder rts = new StringBuilder();
        char ch;
        System.out.println("Original string: "+ str);
        for(int i=0; i<=str.length()-1; i++){
            ch = str.charAt(i);
            rts.insert(0, ch);
        }
        System.out.println("reverse String: "+ rts);
    }
}
