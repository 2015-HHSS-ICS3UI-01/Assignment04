
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dawsr2694
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create Scanner
        Scanner input = new Scanner(System.in);

        //Create Playing board
        int board = 1;
        //Get user input
        //Create a while loop and if statement to make system repeat itself
        while (true) {
            int sum = 0;
            //Will repeat until the player reaches space 100
            if (board != 100) {
                //Get sum of dice
                System.out.print("Enter sum of dice: ");
                sum = input.nextInt();
                if (sum <= 1) {
                    System.out.println("You quit!");
                    break;
                }
                //Check if board is bigger than 100
                if (board + sum <= 100) {
                    //Add sum of dice to board which gives the position moved to
                    board = board + sum;
                    System.out.println("You are now on Square " + board);
                } else {
                    System.out.println("You have exceeded 100 places. You are still on square " + board);
                }
            } else if (board + sum == 100 || board == 100) {
                System.out.println("Congratulations you win!");
                break;
            }
            //Input ladders
            //Activate ladder if player lands on space 9
            if (board == 9) {
                board = 34;
                //Tell user what happened
                System.out.println("You got a ladder! You are now on square 34.");
            }
            //Activate ladder if player lands on space 40
            if (board == 40) {
                board = 64;
                //Tell user what happened
                System.out.println("You got a ladder! You are now on square 64.");
            }
            //Activate ladder if player lands on space 67
            if (board == 67) {
                board = 86;
                //Tell user what happened
                System.out.println("You got a ladder! You are now on square 86.");
            }

            //Input snakes
            //Activate snake if player lands on space 54
            if (board == 54) {
                board = 19;
                //Tell user what happened
                System.out.println("You got eaten by a snake! You are now on square 19.");
            }
            //Activate snake if player lands on space 90
            if (board == 90) {
                board = 48;
                //Tell user what happened
                System.out.println("You got eaten by a snake! You are now on square 48.");
            }
            //Activate snake if player lands on space 99
            if (board == 99) {
                board = 77;
                //Tell user what happened
                System.out.println("You got eaten by a snake! You are now on square 77.");
            }
        }
    }
}
