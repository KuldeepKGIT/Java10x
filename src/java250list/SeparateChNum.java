package java250list;

public class SeparateChNum {
    public static void main(String[] args) {
    String str = "Subbu123raj";
    separateChNum(str);

    }
        public static void separateChNum(String str){
            char[] strArr = str.toCharArray();
            StringBuilder s1 = new StringBuilder();
            StringBuilder s2 = new StringBuilder();
            for(char ch :strArr){
               if(Character.isLetter(ch)){
                   s1.append(ch);
               } else if (Character.isDigit(ch)) {
                   s2.append(ch);
               }
            }
            System.out.println("Output is: "+ s1 +" "+s2);
        }
}
