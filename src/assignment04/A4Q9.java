/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment04;

import java.util.Scanner;

/**
 *
 * @author fostp4040
 */
public class A4Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean done = false;
        boolean player1win=false;
        boolean player2win=false;
        int player1diceroll = 0;
        int player2diceroll = 0;
        int player1position = 1;
        int player2position = 1;
        int square9 = 9;
        int square34 = 34;
        int square40 = 40;
        int square64 = 64;
        int square54 = 54;
        int square19 = 19;
        int square67 = 67;
        int square86 = 86;
        int square90 = 90;
        int square48 = 48;
        int square99 = 99;
        int square77 = 77;
        int square100 = 100;
        while (!player1win && !player2win) {
            System.out.print("Player 1, please enter the sum of the dice: ");
            player1diceroll = input.nextInt();
            player1position = player1position + player1diceroll;
            System.out.println("Player 1 is now on square " + player1position);
            if (player1diceroll < 2 || player1diceroll > 12) {
                System.out.println("Player 1 has quit the game!");
                done = true;
                player1win=true;
                player2win=true;
            }
            if (player1position== 9) {
            player1position = player1position + 25;
            System.out.println("Player 1 is now on square " + player1position);
        } else if (player1position == 40) {
            player1position = player1position + 24;
            System.out.println("Player 1 is now on square " + player1position);
        } else if (player1position == 54) {
            player1position = player1position - 35;
            System.out.println("Player 1 is now on square " + player1position);
        } else if (player1position == 67) {
            player1position = player1position + 19;
            System.out.println("Player 1 is now on square " + player1position);
        } else if (player1position == 90) {
            player1position = player1position - 42;
            System.out.println("Player 1 is now on square " + player1position);
        } else if (player1position == 99) {
            player1position = player1position - 22;
            System.out.println("Player 1 is now on square " + player1position);
        }else if (player1position >= 100 && player2position<100) {
            System.out.println("Player 1 wins!");
            done=true;
            player1win=true;
            player2win=true;
        }
            System.out.print("Player 2, please enter the sum of the dice: ");
            player2diceroll = input.nextInt();
            player2position = player2position + player2diceroll;
            System.out.println("Player 2 is now on square " + player2position);
            if (player2diceroll < 2 || player2diceroll > 12) {
                System.out.println("Player 2 has quit the game!");
                done=true;
                player1win=true;
                player2win=true;
            }
            if (player2position== 9) {
            player2position = player2position + 25;
            System.out.println("Player 2 is now on square " + player2position);
        } else if (player2position == 40) {
            player2position = player2position + 24;
            System.out.println("Player 2 is now on square " + player2position);
        } else if (player2position == 54) {
            player2position = player2position - 35;
            System.out.println("Player 2 is now on square " + player2position);
        } else if (player2position == 67) {
            player2position = player2position + 19;
            System.out.println("Player 2 is now on square " + player2position);
        } else if (player2position == 90) {
            player2position = player2position - 42;
            System.out.println("Player 2 is now on square " + player2position);
        } else if (player2position == 99) {
            player2position = player2position - 22;
            System.out.println("Player 2 is now on square " + player2position);
        }else if (player2position >= 100 && player1position<100) {
            System.out.println("Player 2 wins!");
            done=true;
            player1win=true;
            player2win=true;
        }
        }
           
        
    }
}
