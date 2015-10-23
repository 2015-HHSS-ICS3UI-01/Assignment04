
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mitrm7692
 */
public class Question9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a new Scanner
        Scanner input = new Scanner(System.in);
        //when game starts current space is 1
        int currentSpace = 1;
        //Starting player is player 1
        int currentPlayer=1;
        //loop until game is won or player quits
        while (true) {
            //asks to enter sum of 2 dice
            System.out.println("enter sum of dice");
            //integer for sum of 2 dice
            int roll = input.nextInt();
            //if player types 0 it means they quit and game is over
            if (roll == 0) {
                //if player types 0 scanner outputs "You quit!"
                System.out.println("Yout quit!");
                //If 0 is typed game is done
                break;
            }
            //roll or sum must be greater than 1 or less than 13
            if (roll > 1 & roll < 13) {
                //integer for the space once sum of dice it typed in
                int spaceOnceRolled = currentSpace + roll;
                //if current space is greater than 100 player doesnt move
                if (spaceOnceRolled < 101) {
                    currentSpace = spaceOnceRolled;
                }
            }
            //ladder on square 9 takes you to square 34
            if (currentSpace == 9) {
                currentSpace = 34;
                System.out.println("You have gone up a ladder");
            } 
            //ladder on square 40 takes you to square 64
            else if (currentSpace == 40) {
                currentSpace = 64;
                System.out.println("You have gone up a ladder");
            } 
            //ladder on square 67 takes you to square 86
            else if (currentSpace == 67) {
                currentSpace = 86;
                System.out.println("You have gone up a ladder");
            } 
            //snake on square 54 takes you to square 19
            else if (currentSpace == 54) {
                currentSpace = 19;
                System.out.println("You have landed on a snake");
            } 
            //snake on square 90 takes you to square 48
            else if (currentSpace == 90) {
                currentSpace = 48;
                System.out.println("You have landed on a snake");
            } 
            //snake on square 99 takes you to square 77
            else if (currentSpace == 99) {
                currentSpace = 77;
                System.out.println("You have landed on a snake");
            }
            //Scanner will output what square you are currently on
            System.out.println("You are now on square " + currentSpace);
            //If you land on square 100 scanner says you win the game
            if (currentSpace == 100) {
                System.out.println("You Win!");
                //finish with program
                break;
            }
            while(true){
                //if current player is player 1 switch to player 2
                if (currentPlayer==1){
                    currentPlayer=2;
                    //stop loop
                    break;
                }
                //if current player is player 2 switch to player 1
                if (currentPlayer==2){
                    currentPlayer=1;
                    //stop loop
                    break;
                }
            }
        }
    }
}
