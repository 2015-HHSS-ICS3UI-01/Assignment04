
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author howen2217
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int intpos = 1;
        int intpos2 = 1;
        //creates variables for player 1/2 positions
        System.out.println("Hello, welcome to Snakes and Ladders!");
        //greets players
        while (intpos < 100 && intpos2 < 100) {
            //game will run as long as each player has a score of less than 100
            Scanner input = new Scanner(System.in);
            System.out.println("Player 1, please enter the sum of the two dice rolled?");
            int sumdice = input.nextInt();
            //get and store the sum of dice rolled by player 1
            if (sumdice < 2 || sumdice > 12) {
                System.out.println("Invalid sum, player 2 wins!");
                break;
                //break if an invalid sum is entered
            }

            intpos = intpos + sumdice;
            if (intpos > 100) {
                int amountover = intpos - 100;
                intpos = 100 - amountover;
                //determine where the player will be if the intpos is over 100
            }
            if (intpos == 9) {
                intpos = 34;
            }
            if (intpos == 40) {
                intpos = 64;
            }
            if (intpos == 67) {
                intpos = 87;
            }
            if (intpos == 54) {
                intpos = 19;
            }
            if (intpos == 90) {
                intpos = 48;
            }
            if (intpos == 99) {
                intpos = 77;
            }
            //accounting for all snakes and ladders
            System.out.println("Player 1, your new position is " + intpos);
            //output position
            if (intpos == 100) {
                System.out.println("Congratulations player 1 you win!");
                break;
            }
            //break and congradulate winner if intpos = 100
            System.out.println("Player 2, please enter the sum of the two dice rolled?");
            int sumdice2 = input.nextInt();
            //get and store the sum of dice rolled by player 2
            if (sumdice2 < 2 || sumdice2 > 12) {
                System.out.println("Invalid sum, player 1 wins!");
                break;
                //break if an invalid sum is entered
            }

            intpos2 = intpos2 + sumdice2;
            if (intpos2 > 100) {
                int amountover2 = intpos2 - 100;
                intpos2 = 100 - amountover2;
                //determine where the player will be if the intpos is over 100
            }
            if (intpos2 == 9) {
                intpos2 = 34;
            }
            if (intpos2 == 40) {
                intpos2 = 64;
            }
            if (intpos2 == 67) {
                intpos2 = 87;
            }
            if (intpos2 == 54) {
                intpos2 = 19;
            }
            if (intpos2 == 90) {
                intpos2 = 48;
            }
            if (intpos2 == 99) {
                intpos2 = 77;
            }
            //accounting for all snakes and ladders
            System.out.println("Player 2, your new position is " + intpos2);
            // output position
            if (intpos2 == 100) {
                System.out.println("Congratulations player 2 you win!");
                break;
                //congradulate player and break is they land on square 100
            }
        }
    }
}
