
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hadik9595
 */
public class Question9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner 
        Scanner in = new Scanner(System.in);
        //player's positions!
        int player1 = 1;
        int player2 = 1;
        int sum;
        // As long as player1's square is less than 100 or equal
        while (player1 <= 100) {
            // Player 1's turn asks them their dice
            System.out.println("Player 1's turn!");
            System.out.println("Enter sum of dice ");
            sum = in.nextInt();
            // Equation to determine the player 1's position
            player1 = sum + player1;
            // Informs player 1's position
            System.out.println("You are now on square " + (player1));
            //if player 1 inserts 0, they quit!
            if (sum == 0) {
                System.out.println("Aw leaving so soon? Player 2 wins! ");
                break;
                // Each of these correspond to the piece reaching ladders/snakes according to player 1's position
            }
            if (player1 == 9) {
                System.out.println("Hey look, a ladder! You've climbed to square " + 34);
                player1 = 34;
            }
            if (player1 == 54) {
                System.out.println("Oh no! A wild snake has pulled you down to square " + 19);
                player1 = 19;
            }
            if (player1 == 40) {
                System.out.println("Hey look, a ladder! You've climbed to square " + 64);
                player1 = 64;
            }
            if (player1 == 67) {
                System.out.println("Hey look, a ladder! You've climbed to square " + 86);
                player1 = 86;
            }
            if (player1 == 90) {
                System.out.println("Oh no! A wild snake has pulled you down to square " + 48);
                player1 = 48;
            }
            if (player1 == 99) {
                System.out.println("Oh no! A wild snake has pulled you down to square " + 77);
                player1 = 77;
            }
            // If player 1 reaches square 100, they win!
            if (player1 == 100) {
                System.out.println("You are now on square " + 100);
                System.out.println("Player 1 Win!");
                break;
            }
            // If player 1 exceeds square 100, they must reroll until they advance with the exact amount 
            if (player1 > 100) {
                System.out.println("Nope, Reroll");
                player1 = player1 - sum;
            }
            // Player 2's chunk of coding
            System.out.println("Player 2's turn ");
            System.out.println("Enter sum of dice ");
            sum = in.nextInt();
            // Equation to determine the player 2's position
            player2 = sum + player2;
            // Informs player 2's position
            System.out.println("You are now on square " + (player2));
            //if player 2 inserts 0, they quit!
            if (sum == 0) {
                System.out.println("Aw leaving so soon? Player 1 wins! ");
                break;
                // Each of these correspond to the piece reaching ladders/snakes according to player 1's position
            }
            if (player2 == 9) {
                System.out.println("Hey look, a ladder! You've climbed to square " + 34);
                player2 = 34;
            }
            if (player2 == 54) {
                System.out.println("Oh no! A wild snake has pulled you down to square " + 19);
                player2 = 19;
            }
            if (player2 == 40) {
                System.out.println("Hey look, a ladder! You've climbed to square " + 64);
                player2 = 64;
            }
            if (player2 == 67) {
                System.out.println("Hey look, a ladder! You've climbed to square " + 86);
                player2 = 86;
            }
            if (player2 == 90) {
                System.out.println("Oh no! A wild snake has pulled you down to square " + 48);
                player2 = 48;
            }
            if (player2 == 99) {
                System.out.println("Oh no! A wild snake has pulled you down to square " + 77);
                player2 = 77;
            }
            // If player 2 reaches square 100, they win!
            if (player2 == 100) {
                System.out.println("You are now on square " + 100);
                System.out.println("Player 2 Win!");
                break;
            }
            // If player 2 exceeds square 100, they must reroll until they advance with the exact amount 
            if (player2 > 100) {
                System.out.println("Nope, Reroll");
                player2 = player2 - sum;
            }
            in.close();
        }

    }
}
