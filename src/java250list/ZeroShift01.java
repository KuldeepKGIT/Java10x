package java250list;

public class ZeroShift01 {
    public static void main(String[] args) {
        String str = "32400121200";
        System.out.println(zeroShift(str));

    }
    public static String zeroShift(String str){
        StringBuilder result = new StringBuilder();

        //count trailing zero
        int countZeros = 0;
        for(int i=0; i<str.length(); i++){
            if (str.charAt(i) == '0'){
                countZeros++;
            }
        }
        result.append("0".repeat(Math.max(0, countZeros)));

        //remove zeros from the string
        for(int j=0; j<str.length(); j++){
            if(str.charAt(j)!='0'){
                result.append(str.charAt(j));
            }
        }

        return result.toString();
    }
}
