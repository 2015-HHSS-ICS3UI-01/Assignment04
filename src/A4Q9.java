
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malcr1272
 */
public class A4Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates scanner
        Scanner in = new Scanner(System.in);

        //create integer for both positions on the board
        int spot = 1;
        int spot2 = 1;
        //make while loop to continue asking sum of dice
        
        while (spot >= 1 && spot <= 100 || spot2 >= 1 && spot2 <= 100) {

            System.out.println("Player 1 enter sum of dice:");
            int sum = in.nextInt();
            
            if (sum < 2 || sum > 12) {
                System.out.println("You quit!");
                System.out.println("Player 2 wins");
                break;
            }   
            //make player 1 move within squares 1-100
            if (spot + sum > 100) {
                
            //make the winning square 100
                System.out.println("Roll again, you must land exactly on 100");
            } else {
                spot = spot + sum;
            }
            //output what square player 1 is on
               
            System.out.println("you are now on square " + spot);
            if (spot == 100) {
                System.out.println("Player 1 Wins");
                break;
            }
            
            
            
            
            //make if statements for snakes
            if (spot == 54) {
                System.out.println("You landed on a snake");
                System.out.println("Go back to square 19");
                spot = 19;
            }
            if (spot == 90) {
                System.out.println("You landed on a snake");
                System.out.println("Go back to square 48");
                spot = 48;
            }
            if (spot == 99) {
                System.out.println("You landed on a snake");
                System.out.println("Go back to square 77");
                spot = 77;
            }
            //make if statements for ladders
            if (spot == 9) {
                System.out.println("You landed on a ladder");
                System.out.println("Move up to square 34");
                spot = 34;
            }
            if (spot == 40) {
                System.out.println("You landed on a ladder");
                System.out.println("Move up to square 64");
                spot = 64;
            }
            if (spot == 67) {
                System.out.println("You landed on a ladder");
                System.out.println("Move up to square 86");
                spot = 86;
            }
    
            //make sum of dice between 2 and 12
                   if (sum < 2 || sum > 12) {
                System.out.println("You quit!");
                System.out.println("Player 2 wins");
                break;
                   }
           
            //ask player 2 for the sum of dice
            System.out.println("Player 2 enter sum of dice:");
            int sum2 = in.nextInt();
            
                 if (sum2 < 2 || sum2 > 12) {
                System.out.println("You quit!");
                System.out.println("Player 1 Wins!");
                break;
                 }
                 
            //output what square user 2 is on 
            if (spot2 + sum2 > 100){
                System.out.println("Roll again you must land exactly on square 100");
             
                     
            } else {
                spot2 = spot2 + sum2;}
            
                System.out.println("you are now on square " + spot2);
                
            if (spot2 == 100) {
                System.out.println("Player 2 Wins");
                break;
            }

                //make if statements for player 2 snakes
                if (spot2 == 54) {
                    System.out.println("You landed on a snake");
                    System.out.println("Go back to square 19");
                    spot2 = 19;
                }
                if (spot2 == 90) {
                    System.out.println("You landed on a snake");
                    System.out.println("Go back to square 48");
                    spot2 = 48;
                }
                if (spot2 == 99) {
                    System.out.println("You landed on a snake");
                    System.out.println("Go back to square 77");
                    spot2 = 77;
                }
                //make if statements for player 2ladders
                if (spot2 == 9) {
                    System.out.println("You landed on a ladder");
                    System.out.println("Move up to square 34");
                    spot2 = 34;
                }
                if (spot2 == 40) {
                    System.out.println("You landed on a ladder");
                    System.out.println("Move up to square 64");
                    spot2 = 64;
                }
                if (spot2 == 67) {
                    System.out.println("You landed on a ladder");
                    System.out.println("Move up to square 86");
                    spot2 = 86;
                }
            
        }
    }
}

