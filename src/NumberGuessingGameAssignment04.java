
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class NumberGuessingGameAssignment04 {

    /**
     * @param args the command line arguments
     */
    // Generate a random number //
    // Get a guess from the user //
    // Is the guess too high? // (Tell them "Too high")
    // Is the guess too low? // (Tell them "Too low")
    // Answer is correct!
    public static void main(String[] args) {
        // Create a scanner for input
        Scanner input = new Scanner(System.in);

        // Generate a random number from 1 to 100
        int number = (int) (Math.random() * 100 + 1);

        // Keep track if the game is over
        boolean done = false;
        while (!done) {
            // Guess from the user
            System.out.println("Please guess a number between 1 and 100");
            int guess = input.nextInt();
            // Makes sure guess is inbetween 1-100
            while (guess > 100 || guess < 1) {
                System.out.println("Number is invalid. Please try again.");
                guess = input.nextInt();
            }

            // Guess is to high
            if (guess > number) {
                System.out.println("Too high");

            }// Guess is to low
            else if (guess < number) {
                System.out.println("Too low");
            }// Correct guess, stop the game
            else {
                System.out.println("Congradulations!");
                done = true;
            }
        }
    }
}