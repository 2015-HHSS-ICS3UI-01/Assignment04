
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author whitb0039
 */
public class Question9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        //make new scanner

        System.out.println("You are on space 1");
        //tell the user they are on space number 1

        int currentSpace = 1;
        //set the start space to 1
        
        int currentPlayer = 1;
        //set the starting player to player 1

        while (true) {
            // loop entire program

            System.out.println("Player " + currentPlayer + " enter sum of dice:");
            //ask user to pick a number between 2-12

            int roll = in.nextInt();
            //the next integer is the roll value

            if (roll == 0) {
                System.out.println("You quit!");
                break;
            }
            //if user rolls a 0 they quit the game

            if (roll < 13 & roll > 1) {
                //if they roll an acceptable number make their move

                int spaceAftrRoll = currentSpace + roll;
                //the value of their currents space and their roll

                if (spaceAftrRoll < 101) {
                    // if the value of current space plus roll is greater than 101 re roll

                    currentSpace = spaceAftrRoll;
                    //make current space equal to the space after the roll
                }
                if (currentSpace == 9) {
                    currentSpace = 34;
                } //ask if the user is on a ladder
                else if (currentSpace == 40) {
                    currentSpace = 64;
                } //ask if user is on a ladder
                else if (currentSpace == 54) {
                    currentSpace = 19;
                } //ask if user is on a snake
                else if (currentSpace == 67) {
                    currentSpace = 86;
                } //ask if user is on a ladder
                else if (currentSpace == 90) {
                    currentSpace = 48;
                } //ask if user is on a snake
                else if (currentSpace == 99) {
                    currentSpace = 77;
                }
                //ask if user is on a snake

                System.out.println("Player " + currentPlayer + " is on space " + currentSpace);
                //tell the user what space they are on
                if (currentSpace == 100) {
                    System.out.println("Congratulations, " + currentPlayer + " you win!");
                    break;
                    //if the user is on space 100 output "you win!" and terminate
                }
            }
            while(true){
            if(currentPlayer == 1){
                currentPlayer = 2;
                break;
                //if the current player is 1 switch to player 2
            }
            if(currentPlayer == 2){
                currentPlayer = 1;
                break;
                //if the current player is 2 switch to player 1
            }
            }
        }
    }
}
