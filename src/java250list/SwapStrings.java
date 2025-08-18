package java250list;

public class SwapStrings {
    public static void main(String[] args) {
        String str1 = "kuldeep";
        String str2 = "Kannu";
        System.out.println("Before swap");
        System.out.println(str1);
        System.out.println(str2);
        str1 = str1 + str2;
        str2 = str1.substring(0,str1.length()-str2.length());
        str1 = str1.substring(str2.length());
        System.out.println("After swap");
        System.out.println(str1);
        System.out.println(str2);

    }
}
