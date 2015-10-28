
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dawsr2694
 */
public class Question9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create Scanner
        Scanner input = new Scanner(System.in);

        //Create Playing boards for player 1 and player 2
        int board1 = 1;
        int board2 = 1;

        //Create Counter variable
        int counter = 1;

        //Get user input
        //Create a while loop and if statement to make system repeat itself
        while (true) {

            //Create sum integer
            int sum = 0;

            //Will repeat until the player reaches space 100
            //Player 1 go:
            if (board1 != 100 && counter % 2 == 1) {

                //Get sum of dice
                System.out.print("Player 1 enter sum of dice: ");
                sum = input.nextInt();

                //If user enters a number equal to or less than 1, system will print "you quit!" and break.
                if (sum <= 1) {
                    System.out.println("You quit!");
                    System.out.println("Player 2 you win!");
                    break;
                }

                //If user enters a number equal to or less than 1, system will print "you quit!" and break.
                if (sum <= 1) {
                    System.out.println("You quit!");
                    break;
                }

                //Check if board is bigger than 100
                if (board1 + sum <= 100) {

                    //Add sum of dice to board which gives the position moved to
                    board1 = board1 + sum;
                    System.out.println("Player 1 you are now on square " + board1);
                } else {

                    //If user exceeds 100 places, the computer will tell them they have exceeded 
                    //and output their old location (skips over board+sum)
                    System.out.println("Player 1 you have exceeded 100 places. You are still on square " + board1);
                }
            }//Player 2 go:
            else if (board2 != 100 && counter % 2 == 0) {

                //Get sum of dice
                System.out.print("Player 2 enter sum of dice: ");
                sum = input.nextInt();

                //If user enters a number equal to or less than 1, system will print "you quit!" and break.
                if (sum <= 1) {
                    System.out.println("You quit!");
                    System.out.println("Player 1 you win!");
                    break;
                }

                //Check if board is bigger than 100
                if (board2 + sum <= 100) {

                    //Add sum of dice to board which gives the position moved to
                    board2 = board2 + sum;
                    System.out.println("Player 2 you are now on square " + board2);
                } else {

                    //If user exceeds 100 places, the computer will tell them they have exceeded 
                    //and output their old location (skips over board+sum)
                    System.out.println("Player 2 you have exceeded 100 places. You are still on square " + board2);
                }

                //if their sum or boardplace is 100, it will display "congrats you win!" and break
            }

            //if their sum or boardplace is 100, it will display "congrats you win!" and break
            if (board1 + sum == 100 || board1 == 100) {
                System.out.println("Congratulations, Player 1! You win!");
                break;
            }
            if (board2 + sum == 100 || board2 == 100) {
                System.out.println("Congratulations, Player 2! You win!");
                break;
            }

            //Input ladders
            //Activate ladder if player lands on space 9
            if (board1 == 9) {
                board1 = 34;
                //Tell user what happened
                System.out.println("Player 1 you got a ladder! You are now on square " + board1);
            }
            if (board2 == 9) {
                board2 = 34;
                //Tell user what happened
                System.out.println("Player 2 you got a ladder! You are now on space " + board2);
            }
            //Activate ladder if player lands on space 40
            if (board1 == 40) {
                board1 = 64;
                //Tell user what happened
                System.out.println("Player 1 you got a ladder! You are now on square 64.");
            }
            if (board2 == 40) {
                board2 = 64;
                //Tell user what happened
                System.out.println("Player 2 you got a ladder! You are now on square 64");
            }
            //Activate ladder if player lands on space 67
            if (board1 == 67) {
                board1 = 86;
                //Tell user what happened
                System.out.println("Player 1 you got a ladder! You are now on square 86.");
            }
            if (board2 == 67) {
                board2 = 86;
                //Tell user what happened
                System.out.println("Player 2 you got a ladder! you are now on square 86");
            }
            //Input snakes
            //Activate snake if player lands on space 54
            if (board1 == 54) {
                board1 = 19;
                //Tell user what happened
                System.out.println("Player 1 you got eaten by a snake! You are now on square 19.");
            }
            if (board2 == 54) {
                board2 = 19;
                //Tell user what happened
                System.out.println("Player 2 you got eaten by a snake! You are now on square 19.");
            }
            //Activate snake if player lands on space 90
            if (board1 == 90) {
                board1 = 48;
                //Tell user what happened
                System.out.println("Player 1 you got eaten by a snake! You are now on square 48.");
            }
            if (board2 == 90) {
                board2 = 48;
                //Tell user what happened
                System.out.println("Player 2 you got eaten by a snake! You are now on square 48.");
            }
            //Activate snake if player lands on space 99
            if (board1 == 99) {
                board1 = 77;
                //Tell user what happened
                System.out.println("Player 1 you got eaten by a snake! You are now on square 77.");
            }
            if (board2 == 99) {
                board2 = 77;
                //Tell user what happened
                System.out.println("Player 2 you got eaten by a snake! You are now on square 77.");

            }
            counter++;
        }
    }
}