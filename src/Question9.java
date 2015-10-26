
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class Question9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program to preform the game of snakes and ladders
        // keeping in mind the different methods of playing the game
        // the first player to reach the 100th square has won the game and the other player has lost
        
        // create a scanner to input words
        Scanner input = new Scanner(System.in);
        
        // ask what player A's name is and store the name
        System.out.print("Enter player A's name: ");
        String playerA = input.nextLine();
        
        // ask what player B's name is and store the name
        System.out.print("Enter player B's name: ");
        String playerB = input.nextLine();
        
        // create a variable to represent the place holder of the names of player A or B
        String player;
        
        int positionA = 1;
        int positionB = 1;
        
        // create a variable to represent the place holder of the positions of A or B
        int position;
        
        // create a variable from the sum of the rolls
        int roll;
        
        // create a variable for whos turn it is, either player A or B
        boolean playerATurn = true;
        
        // create a variable to determine when the game has finsihed 
        boolean playGame = true;
        
        // while the game is still being continued and the positions are within 100 keep taking turns
        while (playGame == true) {
            
            // if it is player A's turn then the position and player name should be accounted for player A
            if(playerATurn){
                position = positionA;
                player = playerA;
            // if it is player B's turn then the position and player name should be accounted for player B
            }else {
                position = positionB;
                player = playerB;
            }
            
            // ask the player what the sum of the dice is and collect the sum
            System.out.print(player + ", enter sum of the dice: ");
            roll = input.nextInt();
            
            // if the roll is greater or equal to 2 and is less or equal to 12 move up positions
            if (roll >= 2 && roll <= 12){
                // determine the position the player is at
                position = roll + position;

                // if the player's position is still within 100 than keep rolling
                if (position < 100){
                    // the snakes, if the player is on squares 54, 90, or 99 move the player back and note the move to the user
                    if (position == 54 || position == 90 || position == 99){
                        // Snake at 54 -> 19
                        if(position == 54){
                            position = 19;
                        // Snake at 90 -> 48
                        } else if(position == 90){
                            position = 48;
                        // Snake at 99 -> 77
                        } else if(position == 99){
                            position = 77;
                        }
                        System.out.println(player + " has landed on a snake!");
                    }

                    // the ladders, if the player is on squares 54, 90, or 99 move the player forward and note the move to the user
                    if (position == 9 || position == 40 || position == 67){
                        // ladder at 9 -> 34
                        if(position == 9){
                            position = 34;
                        // ladder at 40 -> 64
                        } else if(position == 40){
                            position = 64;
                        // ladder at 67 -> 86
                        } else if(position == 67){
                            position = 86;
                        }
                        System.out.println(player + " has landed on a ladder!");
                    }
                    
                // if the player's position is equal to 100 then they has won
                } else if (position == 100) {
                    System.out.println(player + " wins!");
                    playGame = false;
                    
                // if the player position is greater than 100 then they won't move
                } else if (position > 100){
                    position = position - roll;
                }
                            
                // if it is player A's turn then position A should store what the new position is
                // also it is now no longer player A's turn
                if(playerATurn){
                    playerATurn = false;
                    positionA = position;

                // if it is player B's turn then position B should store what the new position is
                // also it is now no longer player B's turn
                }else{
                    playerATurn = true;
                    positionB = position;
                }
                
                // if the game is still continuing display the current position    
                if(playGame){
                    System.out.println(player + " is now on square " + position);
                }
                
            // if the player has rolled a 1 or greater than 13 tell them to try again
            } else if(roll == 1 || roll >= 13){
                System.out.println("Try again, roll between 2 and 12.");
                
            // if the player has rolled a 0, then they have quit   
            } else if (roll == 0){
                System.out.println(player + " quits!");
                playGame = false;
            }
        }
        // close input scanner
        input.close();
    }
}
