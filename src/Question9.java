
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godie2014
 */
public class Question9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int player1 = 0;
        
        int player2 = 0;


        //Player 1
        while (true) {
            if (player1 != 100) {
                System.out.println("Enter sum of dice");
            }
            int roll1 = input.nextInt();
            
            if (roll1 < 2 || roll1 > 12) {
                System.out.println("You Quit");
                break;
            }

            //snakes
            if (player1 + roll1 == 54) {
                player1 = 19;
            }

            if (player1 + roll1 == 90) {
                player1 = 48;
            }

            if (player1 + roll1 == 99) {
                player1 = 77;
            }

            //ladders
            if (player1 + roll1 == 9) {
                player1 = 34;
            }

            if (player1 + roll1 == 40) {
                player1 = 64;
            }
            if (player1 + roll1 == 67) {
                player1 = 99;
            }
            
            int move1 = player1 + roll1;
            System.out.println("You are now on square" + move1);
            player1 = player1 + roll1;
            
            if (move1 == 100); {
                System.out.println("Player 1 wins!");
                break;
            }


            //Player 2
            if (player2 != 100) 
           {
                System.out.println("Enter sum of dice");
            }
            int roll2 = input.nextInt();
            
            if (roll1 < 2 || roll2 > 12) {
                System.out.println("You Quit");
                break;
            }
            
            //snakes
            if (player2 + roll2 == 54) {
                player2 = 19;
            }

            if (player2 + roll2 == 90) {
                player2 = 48;
            }

            if (player2 + roll2 == 99) {
                player2 = 77;
            }

            //ladders
            if (player2 + roll2 == 9) {
                player2 = 34;
            }

            if (player2 + roll2 == 40) {
                player2 = 64;
            }
            if (player2 + roll2 == 67) {
                player2 = 99;
            }

            int move2 = player2 + roll2;
              System.out.println("You are now on square" + move2);
            if (move2 == 100);
            {
                System.out.println("Player 2 wins!");
                break;
            }



    
        }

    }
}
