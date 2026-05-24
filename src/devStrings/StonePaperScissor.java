package devStrings;

import java.util.Random;
import java.util.Scanner;

public class StonePaperScissor {
    public static void main(String[] args) {
        String[] Options = {"Stone","Paper","Scissor"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Stone : 0\nPaper : 1\nScissor : 2");
        int n = scanner.nextInt();
        //Valid Input
        if(n<0||n>2){
            System.out.println("Invalid Input");
            return;
        }
        Random random = new Random();
        int num = random.nextInt(Options.length);
        String ComputerChoice = Options[num];
        String userChoice = Options[n];
        System.out.println("Computer Choice: "+ComputerChoice);
        System.out.println("User Choice: "+userChoice);
        if(ComputerChoice.equals(userChoice)){
            System.out.println("It's a tie Play again");
        } else if ((userChoice.equals("Stone")&& ComputerChoice.equals("Scissor"))||userChoice.equals("Scissor")&&ComputerChoice.equals("Paper")||userChoice.equals("Paper")&&ComputerChoice.equals("Stone")) {
            System.out.println("You Won!");
            
        }
        else {
            System.out.println("Computer Won!");
        }
        scanner.close();
    }
}
