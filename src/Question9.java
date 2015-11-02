
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class Question9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner input = new Scanner(System.in);
// new variables called Location and  square , making both equal the zero 
        int player1 = 1;
        int player2 = 1;
        //the following commands will always be executed


        while (true) {
            //makes the computer display "Player 1 - Enter sum of dice:" on the screen
            System.out.println("Player 1 - Enter sum of dice:");
            //puts the input from the user into a variable "sum"
            int sum = input.nextInt();
            //"Player1" now equals itself plus sum amount
            player1 = (player1 + sum);


//if sum is less than or equal to 1, then player 2 wins 
            if (sum <= 1) {
                //tell user they quit and player 2 is the winner
                System.out.println("You Quit! Player 2 Wins!");
                //breaks the program out of the while loop
                break;
            }
//if sum is less than or equal to 13, the following commands will occur
            if (sum >= 13) {
                //makes the computer display "You Quit! Player 2 Wins!"s!");
                System.out.println("You Quit! Player 2 Wins!");
                //breaks the program out of the while loop
                break;
            }
            //if sum is less than or equal to 12, and more than or equal to 2, 
            //and if Location is less than or = 100 the  
            if (sum >= 2) {
                if (sum <= 12) {
                    if (player1 <= 100) {
                        //tell user what space they are on 
                        System.out.println("You are now on square " + player1);
                    }
                }
            }

            //if Location is  9, location will be now be 34
            if (player1 == 9) {
                //tell user they have climbed a ladder 
                System.out.println("You climbed a ladder you are now on space 34!");
                //Location now equals 34
                player1 = 34;
            }
            //if location is 40,tell user they have climbed a ladder and they are now on space 64
            if (player1 == 40) {
                //tell user they climbed a ladder
                System.out.println("You climbed a ladder you are now on space 64!");
                //"Location" now equals 64
                player1 = 64;
            }
            //if Location is equal to 67, tell user there space is now 86
            if (player1 == 67) {
                //makes the computer display "You climbed a ladder to Location 86!" on the screen
                System.out.println("You climbed a ladder ,you are now on space  86!");
                //Location equals 86
                player1 = 86;
            }
            //if Location is equal to 54, you will be oon space 19 
            if (player1 == 54) {
                //makes the computer display "You hit a snake and went back to Location 19!" on the screen
                System.out.println(" A snake ate, you are now on space  19!");
                //"Location" now equals 19
                player1 = 19;
            }
            //if Location is equal to 90, the following commands will be executed
            if (player1 == 90) {
                //makes the computer display "You hit a snake and went back to Location 48!" on the screen
                System.out.println("A snake ate you , you are now on space 48!");
                //"Location" now equals 48
                player1 = 48;
            }
            //if Location is equal to 99, location will be space 77
            if (player1 == 99) {
                // tell user a snake ate them they are no on space 77
                System.out.println("A snake ate you are now on space  77!");
                //"Location" now equals 77
                player1 = 77;
            }
            //if Location is equal to 100, tell player one they win 
            if (player1 == 100) {
                //tell player 1 they win 
                System.out.println("You Win, Player 1!");
                //breaks the program out of the while loop
                break;
            }


            //ask player 2 there sum of dice 
            System.out.println("Player 2 - Enter sum of dice:");
            //adds user’s input  to the variable "rolldice"
            int rolldice = input.nextInt();
            //"Location" now equals itself plus "rolldice"
            player2 = (player2 + rolldice);
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
            if (sum >= 2) {
                if (sum <= 12) {
                    if (player2 <= 100) {
                        //tell the user what space they are on 
                        System.out.println("You are now on square " + player2);

                    }
                }
            }

            //if Location is equal to 9, tell user they climbed a ladder and there new space 
            if (player2 == 9) {
                //makes the computer display "You climbed a ladder to Location 34!" on the screen
                System.out.println("You climbed a ladder to Location 34!");
                //"square" now equals 34
                player2 = 34;
            }
            //if Location is equal to 40, tell user they climbed a ladder and there new space 
            if (player2 == 40) {
                //makes the computer display "You climbed a ladder to Location 64!" on the screen
                System.out.println("You climbed a ladder to Location 64!");
                //"square" now equals 64
                player2 = 64;
            }
            //if Location is equal to 67, tell user they climbed a ladder and there new space 
            if (player2 == 67) {
                //makes the computer display "You climbed a ladder to Location 86!" on the screen
                System.out.println("You climbed a ladder to Location 86!");
                //"square" now equals 86
                player2 = 86;
            }
            //if Location is equal to 54, tell the user a snake ate then and there new location
            if (player2 == 54) {
                //tell the user a snake ate them and there new space is 19 
                System.out.println("You hit a snake and went back to Location 19!");
                //"square" now equals 19
                player2 = 19;
            }
            //if Location is equal to 90, tell the user a snake ate then and there new location
            if (player2 == 90) {
                ////tell the user a snake ate them and their new space is 48
                System.out.println("You hit a snake and went back to Location 48!");
                //"square" now equals 48
                player2 = 48;
            }
            //if Location is equal to 99, tell the user a snake ate then and there new location
            if (player2 == 99) {
                ////tell the user a snake ate them and their new space is 77
                System.out.println("You hit a snake and went back to Location 77!");
                //"square" now equals 77
                player2 = 77;
            }
            //if Location is equal to 100, tell player 2 they have won !
            if (player2 == 100) {

                System.out.println("You Win, Player 2!");
                //breaks the program out of the while loop
                break;
            }
        }

    }
}



    

