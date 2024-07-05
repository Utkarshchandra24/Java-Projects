import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Rock, Paper and Scissors Game Challenge! ");
        System.out.println("What do you want to choose? Type 0 for Rock, 1 for Paper, 2 for Scissors");
        Scanner sc = new Scanner(System.in);
        int playerchoice = Integer.parseInt(sc.nextLine());
        if(playerchoice>=0 && playerchoice<=2) {
            playRockPaperScissors(playerchoice);
        } else
            System.out.println("User entered an invalid input, you lose!");

    }

    public static void playRockPaperScissors(int playerchoice) {
           Random random = new Random();
           int compchoice = random.nextInt(0,3);
           String cmessage,pmessage;

           if(compchoice==0)
               cmessage = "rock";
           else if(compchoice==1)
               cmessage = "paper";
           else
               cmessage = "scissors";

            if(playerchoice==0)
                pmessage = "rock";
            else if(playerchoice==1)
                pmessage = "paper";
            else
                pmessage = "scissors";

           System.out.println("Player chose " + pmessage + " and the computer chose " + cmessage);

           System.out.println();

           if(playerchoice==2 && compchoice==0)
                System.out.println("You Lose!");
           else if(playerchoice>compchoice)
                System.out.println("You Win!");
           else if(playerchoice<compchoice)
                System.out.println("You Lose!");
           else
                System.out.println("Its a Draw!");

    }

}