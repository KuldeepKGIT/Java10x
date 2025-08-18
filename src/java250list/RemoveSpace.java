package java250list;

public class RemoveSpace {
    public static void main(String[] args) {
        String str = "Java program to remove space from a given string";
        String noSpace = str.replaceAll("\\s+", "");
        System.out.println("String without spaces: "+noSpace);
    }
}
