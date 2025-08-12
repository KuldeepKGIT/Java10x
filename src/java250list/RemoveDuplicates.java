package java250list;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println(noDup(str));
    }
    public static String noDup(String str){
        StringBuilder noDupStr = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
           if(noDupStr.indexOf(String.valueOf(ch))==-1){
               noDupStr.append(ch);
           }
        }
        return noDupStr.toString();
    }
}
