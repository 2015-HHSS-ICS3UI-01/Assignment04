
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jon
 */
public class Question9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program to preform the game of Snakes and Ladders
        // keeping in mind the different methods of playing the game
        // the first player to reach the 100th square has won the game and the other player has lost
        
        // create a scanner to input words
        Scanner input = new Scanner(System.in);
        
        // ask what player A's name is
        System.out.print("Enter player A's name: ");
        // collect the name of player A
        String playerA = input.nextLine();
        
        // ask what player B's name is
        System.out.print("Enter player B's name: ");
        // collect the name of player B
        String playerB = input.nextLine();
        
        // create a variable to determine when the game has finsished
        boolean playGame = true;
        
        // create a variable to track the position player A will first being starting at and throughout the rest of the game
        int positionA = 1;
        // create a variable to track the position player B will first being starting at and throughout the rest of the game
        int positionB = 1;
        
        // create a variable to deponstrate the number player A is rolling up by
        int rollA;
        // create a variable to deponstrate the number player B is rolling up by
        int rollB;
        
        // creare a variable to track when player A's turn is up
        int playerATurn = 0;
        // creare a variable to track when player B's turn is up
        int playerBTurn = 0;
        
        // while the game is still being continued keep taking turns
        while (playGame == true) {
            
            
            // player A's turn is first, therfore when player b has finshed their turn, then playerATurn and PlayerBTurn is equal
            if(playerATurn == playerBTurn){
                                
                // while the playerA's position is below 100 player A will keep rolling until they reach that position
                if (positionA < 100){
                    // ask player A what the sum of the dice is
                    System.out.print(playerA + ", enter sum of the dice: ");
                    // receive the sum of the roll for player A
                    rollA = input.nextInt();
        
                    // if the roll is greater or equal to 2 and is less or equal to 12 move up positions
                    if (rollA >= 2 && rollA <= 12){
                        // determine the position player A is at
                        positionA = rollA + positionA;
                        // add one value to the variable of how many turns player A has taken
                        playerATurn = playerATurn + 1;
                        // if player A's position is still within 100 then continue the game
                        if (positionA < 100){
                            // the snakes, if player A is on squares 54, 90, or 99 move the player back
                            // if player A on square 54 move player A back to square 19
                            if(positionA == 54){
                                positionA = 19;
                            // if the player is on square 90 move player A back to square 48
                            } else if(positionA == 90){
                                positionA = 48;
                            // if player A is on square 99 move the player back to square 77
                            } else if(positionA == 99){
                                positionA = 77;
                            }
                            
                            // the ladders, if player A is on squares 54, 90 , or 99 move the player forward
                            // if player A is on square 9 move the player forward to square 34
                            if(positionA == 9){
                                positionA = 34;
                            // if player A is on square 40 move the player back to square 64
                            } else if(positionA == 40){
                                positionA = 64;
                                // if player A is on square 90 move the player back to square 48
                            } else if(positionA == 67){
                                positionA = 86;
                            }
                        // if player A's position is equal to 100 then they has won
                        } else if (positionA == 100) {
                            System.out.println(playerA + " wins!");
                            playGame = false;
                            break;
                        // if player A's position is greater than 100 then they won't move
                        } else if (positionA > 100){
                            positionA = positionA - rollA;
                        }
                    // if player A has rolled a 1 or greater than 13 tell them to try again
                    } else if(rollA == 1 || rollA >= 13){
                        System.out.println("Try again, roll between 2 and 12.");                        
                    // if player A has rolled a 0, then they have quit
                    } else if (rollA == 0){
                        System.out.println(playerA + " quits!");
                        playGame = false;
                        break;
                    }
                    // display the position player A is at
                    System.out.println(playerA + " is now on square " + positionA);
                }
            }
            // player B's turn is seoond therefore once player A's turn is finsihed, playerBTurn value will be less than playerATurn
            if (playerBTurn < playerATurn && playGame == true){
                // while player B's position is below 100 the player will keep rolling until he reaches that position
                if (positionB < 100){
                    // ask player B what the sum of the dice is
                    System.out.print(playerB + ", enter sum of the dice: ");
                    // receive the sum of the roll fo player B
                    rollB = input.nextInt();
                    // if the roll is greater or equal to 2 and is less or equal to 12 move up positions
                    if (rollB >= 2 && rollB <= 12){
                        // determine the position player B is at
                        positionB = rollB + positionB;
                        // add one value to the variable of how many turns player B has taken
                        playerBTurn = playerBTurn + 1;
                        // if player B's position is still within 100 than keep rolling
                        if (positionB < 100){
                            // the snakes, if player B is on squares 54, 90, or 99 move the player back
                            // if player B is on square 54 move the player back to square 19
                            if(positionB == 54){
                                positionB = 19;
                            // if player B is on square 90 move the player back to square 48
                            } else if(positionB == 90){
                                positionB = 48;
                            // if player B is on square 99 move the player back to square 77
                            } else if(positionB == 99){
                                positionB = 77;
                            }
                            
                            // the ladders, if player B is on squares 54, 90 , or 99 move the player forward
                            // if player B is on square 9 move the player forward to square 34
                            if(positionB == 9){
                                positionB = 34;
                            // if player B is on square 40 move the player back to square 64
                            } else if(positionB == 40){
                                positionB = 64;
                                // if player B is on square 90 move the player back to square 48
                            } else if(positionB == 67){
                                positionB = 86;
                            }
                        // if player B's position is equal to 100 then he has won
                        } else if (positionB == 100) {
                            System.out.println(playerB + " wins!");
                            playGame = false;
                            break;
                        // if player B's position is greater than 100 then he won't move
                        } else if (positionB > 100){
                            positionB = positionB - rollB;
                        }
                    // if player B has rolled a 1 or greater than 13 tell them to try again
                    } else if(rollB == 1 || rollB >= 13){
                        System.out.println("Try again, roll between 2 and 12.");
                    // if player B has rolled a 0, then they have quit
                    } else if (rollB == 0){
                        System.out.println(playerB + " quits!");
                        playGame = false;
                        break;
                    }
                    // display the postition player B is at
                    System.out.println(playerB + " is now on square " + positionB);
                }
            }
        }
        // close input scanner
        input.close();
    }
    
}
