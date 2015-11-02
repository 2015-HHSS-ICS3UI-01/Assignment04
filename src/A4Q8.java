
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moraj0721
 */
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
// new variables called Location and  square , making both equal the zero 
        int Location = 1;
        int square = 1;
        //the following commands will always be executed


        while (true) {
            //makes the computer display "Player 1 - Enter roll of dice:" on the screen
            System.out.println("Player 1 - Enter roll of dice:");
            //puts the input from the user into a variable "roll"
            int roll = input.nextInt();
            //"Location" now equals itself plus roll amount
            Location = (Location + roll);


//if roll is less than or equal to 1, then player 2 wins 
            if (roll <= 1) {
                //tell user they quit and player 2 is the winner
                System.out.println("You Quit! Player 2 Wins!");
                //breaks the program out of the while loop
                break;
            }
//if roll is less than or equal to 13, the following commands will occur
            if (roll >= 13) {
                //makes the computer display "You Quit! Player 2 Wins!"s!");
                System.out.println("You Quit! Player 2 Wins!");
                //breaks the program out of the while loop
                break;
            }
            //if roll is less than or equal to 12, and more than or equal to 2, 
            //and if Location is less than or = 100 the  
            if (roll >= 2) {
                if (roll <= 12) {
                    if (Location <= 100) {
                        //tell user what space they are on 
                        System.out.println("You are now on square " + Location);
                    }
                }
            }

            //if Location is  9, location will be now be 34
            if (Location == 9) {
                //tell user they have climed a ladder 
                System.out.println("You climbed a ladder you are now on space 34!");
                //Location now equals 34
                Location = 34;
            }
            //if location is 40,tell user they have climed a ladder and they are now on space 64
            if (Location == 40) {
                //tell uuser they climed a ladder
                System.out.println("You climbed a ladder you are now on space 64!");
                //"Location" now equals 64
                Location = 64;
            }
            //if Location is equal to 67, tell user theere psace is now 86
            if (Location == 67) {
                //makes the computer display "You climbed a ladder to Location 86!" on the screen
                System.out.println("You climbed a ladder ,you are now on space  86!");
                //Location equals 86
                Location = 86;
            }
            //if Location is equal to 54, you will be oon space 19 
            if (Location == 54) {
                //makes the computer display "You hit a snake and went back to Location 19!" on the screen
                System.out.println(" A snake ate, you are now on space  19!");
                //"Location" now equals 19
                Location = 19;
            }
            //if Location is equal to 90, the following commands will be executed
            if (Location == 90) {
                //makes the computer display "You hit a snake and went back to Location 48!" on the screen
                System.out.println("A snake ate you , you are now on space 48!");
                //"Location" now equals 48
                Location = 48;
            }
            //if Location is equal to 99, location will be space 77
            if (Location == 99) {
                // tell user a snake ate them they are no on space 77
                System.out.println("A snake ate you are now on space  77!");
                //"Location" now equals 77
                Location = 77;
            }
            //if Location is equal to 100, tell player one they win 
            if (Location == 100) {
                //tell player 1 they win 
                System.out.println("You Win, Player 1!");
                //breaks the program out of the while loop
                break;
            }


            //ask player 2 their roll of dice 
            System.out.println("Player 2 - Enter roll of dice:");
            //adds users input  to the variable "rolldice"
            int rolldice = input.nextInt();
            //"Location" now equals itself plus "rolldice"
            square = (square + rolldice);
            //if rolldice is less than or equal to 1, then player 2 quits and player 1 wins 
            if (rolldice <= 1) {
                //tell player 2 they quit anf player 2 wins 
                System.out.println("You Quit! Player 1 Wins!");
                //breaks the program out of the while loop
                break;
            }
            //if rolldice is less than or equal to 13, the following commands will be executed
            if (rolldice >= 13) {
                //makes the computer display "You Quit! Player 1 Wins!" on the screen
                System.out.println("You Quit! Player 1 Wins!");
                //breaks the program out of the while loop
                break;
            }
            //if rolldice is less than or equal to 12, more than or equal to 2, 
            //and if Location is less than or equal to 100 the following commands will be executed
            if (roll >= 2) {
                if (roll <= 12) {
                    if (square <= 100) {
                        //tell the user what space they are on 
                        System.out.println("You are now on square " + square);

                    }
                }
            }

            //if Location is equal to 9, tell user they climed a ladder and their new space 
            if (square == 9) {
                //makes the computer display "You climbed a ladder to Location 34!" on the screen
                System.out.println("You climbed a ladder to Location 34!");
                //"square" now equals 34
                square = 34;
            }
            //if Location is equal to 40, tell user they climed a ladder and their new space 
            if (square == 40) {
                //makes the computer display "You climbed a ladder to Location 64!" on the screen
                System.out.println("You climbed a ladder to Location 64!");
                //"square" now equals 64
                square = 64;
            }
            //if Location is equal to 67, tell user they climed a ladder and their new space 
            if (square == 67) {
                //makes the computer display "You climbed a ladder to Location 86!" on the screen
                System.out.println("You climbed a ladder to Location 86!");
                //"square" now equals 86
                square = 86;
            }
            //if Location is equal to 54, tell the user a snake ate then and their new location
            if (square == 54) {
                //tell the user a snake ate them and their new space is 19 
                System.out.println("You hit a snake and went back to Location 19!");
                //"square" now equals 19
                square = 19;
            }
            //if Location is equal to 90, tell the user a snake ate then and their new location
            if (square == 90) {
                ////tell the user a snake ate them and their new space is 48
                System.out.println("You hit a snake and went back to Location 48!");
                //"square" now equals 48
                square = 48;
            }
            //if Location is equal to 99, tell the user a snake ate then and their new location
            if (square == 99) {
                ////tell the user a snake ate them and their new space is 77
                System.out.println("You hit a snake and went back to Location 77!");
                //"square" now equals 77
                square = 77;
            }
            //if Location is equal to 100, tell player 2 they have won !
            if (square == 100) {

                System.out.println("You Win, Player 2!");
                //breaks the program out of the while loop
                break;
            }
        }


    }
}
