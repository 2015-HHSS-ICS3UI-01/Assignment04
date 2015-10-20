
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author richj0985
 */
public class Question9Version2 {

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
        int positionB = 1;

        // create a variable to deponstrate the number player A is rolling up by
        int roll;

        // creare a variable to track when player A's turn is up
        boolean playerATurn = true;

        // while the game is still being continued keep taking turns
        while (playGame == true) {


            // while the playerA's position is below 100 player A will keep rolling until they reach that position
            if (positionA < 100 && positionB < 100) {
                // ask player A what the sum of the dice is
                if (playerATurn) {
                    System.out.print(playerA + ", enter sum of the dice: ");
                } else {
                    System.out.print(playerB + ", enter sum of the dice: ");
                }

                // receive the sum of the roll for player A
                roll = input.nextInt();
                // if the roll is greater or equal to 2 and is less or equal to 12 move up positions
                if (roll >= 2 && roll <= 12) {
                    // determine the position player A is at
                    if (playerATurn) {
                        positionA = positionA + roll;
                    } else {
                        positionB = positionB + roll;
                    }
                    // if player A's position is still within 100 then continue the game
                    if (positionA < 100 && positionB < 100) {
                        // the snakes, if player A is on squares 54, 90, or 99 move the player back
                        // if player A on square 54 move player A back to square 19

                        if (playerATurn) {
                            if (positionA == 54) {
                                positionA = 19;
                            } // if the player is on square 90 move player A back to square 48
                            else if (positionA == 90) {
                                positionA = 48;
                                // if player A is on square 99 move the player back to square 77
                            } else if (positionA == 99) {
                                positionA = 77;
                            }

                            // the ladders, if player A is on squares 54, 90 , or 99 move the player forward
                            // if player A is on square 9 move the player forward to square 34
                            if (positionA == 9) {
                                positionA = 34;
                                // if player A is on square 40 move the player back to square 64
                            } else if (positionA == 40) {
                                positionA = 64;
                                // if player A is on square 90 move the player back to square 48
                            } else if (positionA == 67) {
                                positionA = 86;
                            } // if player A's position is equal to 100 then they has won
                            else if (positionA == 100) {
                                System.out.println(playerA + " wins!");
                                playGame = false;
                                break;
                                // if player A's position is greater than 100 then they won't move
                            } else if (positionA > 100) {
                                positionA = positionA - roll;
                            }
                            System.out.println(playerA + " is now on square " + positionA);
                        } else {
                            if (positionB == 54) {
                                positionB = 19;
                            } // if the player is on square 90 move player A back to square 48
                            else if (positionB == 90) {
                                positionB = 48;
                                // if player A is on square 99 move the player back to square 77
                            } else if (positionB == 99) {
                                positionB = 77;
                            }

                            // the ladders, if player A is on squares 54, 90 , or 99 move the player forward
                            // if player A is on square 9 move the player forward to square 34
                            if (positionB == 9) {
                                positionB = 34;
                                // if player A is on square 40 move the player back to square 64
                            } else if (positionB == 40) {
                                positionB = 64;
                                // if player A is on square 90 move the player back to square 48
                            } else if (positionB == 67) {
                                positionB = 86;
                            } // if player A's position is equal to 100 then they has won
                            else if (positionB == 100) {
                                System.out.println(playerA + " wins!");
                                playGame = false;
                                break;
                                // if player A's position is greater than 100 then they won't move
                            } else if (positionB > 100) {
                                positionB = positionB - roll;
                            }
                            System.out.println(playerB + " is now on square " + positionB);
                        }
                        // display the position player A is at
                        
                        if (playerATurn) {
                            playerATurn = false;
                        } else {
                            playerATurn = true;
                        }

                        // if player A has rolled a 1 or greater than 13 tell them to try again
                    } else if (roll == 1 || roll >= 13) {
                        System.out.println("Try again, roll between 2 and 12.");
                        // if player A has rolled a 0, then they have quit
                    } else if (roll == 0) {
                        if(playerATurn){
                            System.out.println(playerA + " quits!");
                        }else{
                            System.out.println(playerB + " quits!");
                        }
                        playGame = false;
                        break;
                    }

                }
            }
            // close input scanner
        }
            input.close();
        }
    }
