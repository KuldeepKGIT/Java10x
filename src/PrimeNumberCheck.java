import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        if(primeNumberCheck(num)){
            System.out.println(num+" is a prime number");
        }
        else {
            System.out.println(num+"is not a prime number");
        }


    }
    public static boolean primeNumberCheck(int num){
        boolean isPrime = num>1;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0){
                isPrime = false;
            }
        }
        return isPrime;
    }

}
