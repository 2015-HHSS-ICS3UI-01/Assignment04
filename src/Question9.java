
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503
 */
public class Question9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new Scanner to read in values
        Scanner in = new Scanner(System.in);

        // create an integer to store a variable 
        int player1 = 1;
        int total;
        int player2 = 1;

        //Will make sure player1 stays below or equal to 100
        while (player1 <= 100) {
            System.out.println("Player 1's turn!");
            System.out.println("Enter sum of dice: ");
            total = in.nextInt();

            // To Deterine the player 1's position 
            player1 = total + player1;

            // Indicates what player 1's position is. 
            System.out.println("You are now on square: " + (player1));

            // If player 1 inserts a 0, they quit
            if (total == 0) {
                System.out.println("Hah, leaving so soon? Player 2 Wins! ");
                break;
            }

            // If the user's peice lands at the bottom of a latter they climb up it
            if (player1 == 9) {
                System.out.println("Look a Latter! You've climbed up to square " + 34);
                player1 = 34;
            }
            // If the user's peice lands at the bottom of a latter they climb up it
            if (player1 == 40) {
                System.out.println("Look a Latter! You've climbed up to square " + 64);
                player1 = 64;
            }
            // If the user's peice lands on a snakes head they go down it
            if (player1 == 54) {
                System.out.println("Oh No A Snake!! You've gone down to square " + 19);
                player1 = 19;
            }
            // If the user's peice lands at the bottom of a latter they climb up it
            if (player1 == 67) {
                System.out.println("Look a Latter! You've climbed up to square " + 86);
                player1 = 86;
            }
            // If the user's peice lands on a snakes head they go down it
            if (player1 == 90) {
                System.out.println("Oh No A Snake!! You've gone down to square " + 48);
                player1 = 48;
            }
            // If the user's peice lands on a snakes head they go down it
            if (player1 == 99) {
                System.out.println("Oh No A Snake!! You've gone down to square " + 77);
                player1 = 77;
            }
            // If the user's peice equals 100 then the game stops
            if (player1 == 100) {
                System.out.println("Player 1 Wins! ");
                break;
            }
            // If the user rolls and the total causes the peice to exceed 100 then they will role again
            if (player1 > 100) {
                System.out.println("Nope! Reroll ");
                player1 = player1 - total;
            }


            // Player 2's part
            System.out.println("Player 2's turn ");
            System.out.println("Enter the sum of dice: ");
            total = in.nextInt();

            // To Deterine the player 2's position 
            player2 = total + player2;

            // Indicates what Player 2's position is 
            System.out.println("You are now on square " + (player2));

            // If player 2 inserts a 0, they quit
            if (total == 0) {
                System.out.println("Hah, leaving so soon? Player 1 Wins! ");
                break;
            }
            // If the user's peice lands at the bottom of a latter they climb up it
            if (player2 == 9) {
                System.out.println("Look a Latter! You've climbed up to square " + 34);
                player2 = 34;
            }
            // If the user's peice lands at the bottom of a latter they climb up it
            if (player2 == 40) {
                System.out.println("Look a Latter! You've climbed up to square " + 64);
                player2 = 64;
            }
            // If the user's peice lands on a snakes head they go down it
            if (player2 == 54) {
                System.out.println("Oh No A Snake!! You've gone down to square " + 19);
                player2 = 19;
            }
            // If the user's peice lands at the bottom of a latter they climb up it
            if (player2 == 67) {
                System.out.println("Look a Latter! You've climbed up to square " + 86);
                player2 = 86;
            }
            // If the user's peice lands on a snakes head they go down it
            if (player2 == 90) {
                System.out.println("Oh No A Snake!! You've gone down to square " + 48);
                player2 = 48;
            }
            // If the user's peice lands on a snakes head they go down it
            if (player2 == 99) {
                System.out.println("Oh No A Snake!! You've gone down to square " + 77);
                player2 = 77;
            }
            // If the user's peice equals 100 then the game stops
            if (player2 == 100) {

                System.out.println("Player 2 Wins! ");
                break;
            }
            // If the user rolls and the total causes the peice to exceed 100 then he will role again
            if (player2 > 100) {
                System.out.println("Nope! Reroll ");
                player2 = player2 - total;
            }

        }

    }
}
