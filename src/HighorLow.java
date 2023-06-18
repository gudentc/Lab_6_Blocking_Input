import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rn = new Random();
        // Declare Variables
        int computerRandom = 0;
        int userGuess = 0;
        String trash = "";
        boolean done = false;
        System.out.println("\n      High Low");
        System.out.println("I will choose a number between 1 and 10");
        System.out.println("      See if you can guess the number");
        computerRandom = rn.nextInt(10) + 1;
        do{
            System.out.print("\nEnter your guess: ");
            if(in.hasNextInt()) {
                userGuess = in.nextInt();
                if (userGuess >= 1 && userGuess <= 10) {
                    in.nextLine();
                    done = true;
                }else{
                    in.nextLine();
                    System.out.println("Your guess was: " + userGuess);
                    System.out.println("Please choose a valid number between 1 and 10.");
                }
            }
            else{
                trash = in.nextLine();
                System.out.println("Your guess was: " + trash);
                System.out.println("Please choose a valid number for your next guess.");
            }
        }while(!done);
        System.out.println("\nMy random number that I chose was: " + computerRandom);
        if (userGuess < computerRandom) {
            System.out.println("Your guess was too low.");
        }else if (userGuess > computerRandom) {
            System.out.println("Your guess was too high.");
        }else{
            System.out.println("Your guess was correct and on the money!");
        }
    }
}
