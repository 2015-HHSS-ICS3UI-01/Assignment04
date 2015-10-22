
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author watsk8668
 */
public class A4Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input scanner
        Scanner input = new Scanner(System.in);

        //where is the game peice 
        int playerA = 1;
        int playerB = 1;

        while (true) {
            if (playerA != 100) 
            //roll dice
            {
                System.out.println("Player A enter sum of dice: ");
            }
            int rollA = input.nextInt();

            //force a number between 2 and 12
            if (rollA < 2 || rollA > 12) {
                System.out.println("You Quit!");
                break;
            }
            //snakes
            if (playerA + rollA == 54) {
                playerA = 19;
            }
            if (playerA + rollA == 90) {
                playerA = 48;
            }
            if (playerA + rollA == 99) {
                playerA = 77;
            }
            //ladders
            if (playerA + rollA == 9) {
                playerA = 34;
            }
            if (playerA + rollA == 40) {
                playerA = 64;
            }
            if (playerA + rollA == 67) {
                playerA = 86;
            }
            //move player A
            int moveAmountA = playerA + rollA;
            System.out.println("You are now on square " + moveAmountA);
            playerA = playerA + rollA;

            //if player A reaches the end first
            if (moveAmountA == 100) {
                System.out.println("Player A wins!");
                break;
            }

            //player B
            if (playerB != 100) 
            //roll dice
            {
                System.out.println("Player B enter sum of dice: ");
            }
            int rollB = input.nextInt();

            //force a number between 2 and 12
            if (rollB < 2 || rollB > 12) {
                System.out.println("You Quit!");
                break;
            }
            //snakes
            if (playerB + rollB == 54) {
                playerB = 19;
            }
            if (playerB + rollB == 90) {
                playerB = 48;
            }
            if (playerB + rollB == 99) {
                playerB = 77;
            }
            //ladders
            if (playerB + rollB == 9) {
                playerB = 34;
            }
            if (playerB + rollB == 40) {
                playerB = 64;
            }
            if (playerB + rollB == 67) {
                playerB = 86;
            }
            //move player B
            int moveAmountB = playerB + rollB;
            System.out.println("You are now on square " + moveAmountB);
            playerB = playerB + rollB;

            //if player B reaches the end first
            if (moveAmountB == 100) {
                System.out.println("Player B wins!");
                break;
            }
        }


    }
}
