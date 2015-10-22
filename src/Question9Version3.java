
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class Question9Version3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program to preform the game of Snakes and Ladders
        // keeping in mind the different methods of playing the game
        // the first player to reach the 100th square has won the game and the other player has lost
        
        // create a scanner to input words
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter player A's name: ");
        String playerA = input.nextLine();
        
        System.out.print("Enter player B's name: ");
        String playerB = input.nextLine();
        
        String player;
        
        boolean playGame = true;
        
        int positionA = 1;
        int positionB = 1;
        int position;
        
        int roll;
        
        boolean playerATurn = true;
        
        while (playGame == true) {
            
            if(playerATurn){
                position = positionA;
                player = playerA;
            }else {
                position = positionB;
                player = playerB;
            }
                                
            if (position < 100){
                System.out.print(player + ", enter sum of the dice: ");
                roll = input.nextInt();

                if (roll >= 2 && roll <= 12){
                    position = roll + position;
                    if (position < 100){
                        if(position == 54){
                            position = 19;
                        } else if(position == 90){
                            position = 48;
                        } else if(position == 99){
                            position = 77;
                        }

                        if(position == 9){
                            position = 34;
                        } else if(position == 40){
                            position = 64;
                        } else if(position == 67){
                            position = 86;
                        }
                    } else if (position == 100) {
                        System.out.println(player + " wins!");
                        playGame = false;
                        break;
                    } else if (position > 100){
                        position = position - roll;
                    }
                } else if(roll == 1 || roll >= 13){
                    System.out.println("Try again, roll between 2 and 12.");                        
                } else if (roll == 0){
                    System.out.println(player + " quits!");
                    playGame = false;
                    break;
                }
                System.out.println(player + " is now on square " + position);
            }
            if(playerATurn){
                playerATurn = false;
                positionA = position;
            }else{
                playerATurn = true;
                positionB = position;
            }
        }
        // close input scanner
        input.close();
    }
}
