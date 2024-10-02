import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // To take  input from the user
        Random random = new Random(); // To generate a random number

        //Introduction to user
        System.out.println("Welcome to Guess The Number ");

        // Declaring all the variables
        int MaxAttempts=8;
        int RoundsPlayed=0;
        int TotalScore=0;

        while(true)
        {
            int c=0;
            int GenNum = random.nextInt(100)+1; // Generating a random number between 1 and 100
            int PointsAdded = 100;
            boolean GuessCorrect = false;

            // Here the actual game starts
            System.out.println("Round " + (RoundsPlayed+1)+ "has started of Guess the number Game :");

            for(int attempt = 1; attempt <= MaxAttempts; attempt++)
            {
                System.out.println("Attempt " + attempt + ", Enter your Guess:");
                int Guess = sc.nextInt();

                //  Checking the number guessed by the user
                if(Guess == GenNum) {
                    System.out.println(" Correct ! You guessed the number in  " + attempt + " attempts ");
                    GuessCorrect = true;
                    // Deducting points for Wrong Guess
                    TotalScore += PointsAdded - (attempt - 1) * 10;
                    break;
                }
                else if(Guess<GenNum) {
                    System.out.println("Too Low ! Guess Higher");
                }
                else {
                    System.out.println("Too High ! Guess Lower");
                }
            }
            if(!GuessCorrect) {
                System.out.println(" You are out of attempts , the number was" + GenNum);
            }
            //Increment the rounds played
            RoundsPlayed++;

            System.out.println("Current Score " + TotalScore);

            // Asking the user if they want to play again
            System.out.println("Do you want to play again? (y/n)");
            String Replay = sc.next();

            if(Replay.equals("n")) {
                break;// We will exit the loop if the input is no
            }
        }
        System.out.println("Game Over!!!");
        System.out.println("Rounds Played: " + RoundsPlayed);
        System.out.println("Total Score: " + TotalScore);


    }
}