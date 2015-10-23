
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hadida
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creates a scanner
        Scanner in = new Scanner(System.in);
        // Spot corresponds to the exact position on the board of the player piece
       int spot = 1;
       // Stops working when the game is finished
        while(spot <= 100){
            //asks human the number of dice rolled
            System.out.println("Enter sum of dice ");
             int sum = in.nextInt();
            
            // equation for position
            spot = sum + spot;
            System.out.println("You are now on square " +(spot));
            // Each of these correspond to the piece reaching ladders/snakes 
            if (sum == 0){
                System.out.println("You Quit!");
                break;
            }if (spot == 9){
                System.out.println("You are now on square " + 34 );
                spot = spot + 25;
            }if (spot == 54){
                System.out.println("You are now on square "+ 19 );
                spot = spot - 35;
            }if (spot == 40){
                System.out.println("You are now on square " + 64);
                spot = spot + 24;
            }if (spot == 67){
                System.out.println("You are now on square " + 86);
                spot = spot + 19;
            }if (spot == 90){
                System.out.println("You are now on square " +48);
                spot = spot - 42;
            }if (spot == 99){
                System.out.println("You are now on square " + 77);
                spot = spot - 22;
                //Once player has reached square 100, he wins
            }if (spot == 100){
                System.out.println("You are now on square " + 100);
                System.out.println("You Win!");
                break;
                // If player exceeds square 100, they must reroll until they advance with the exact amount 
            }if (spot > 100){
                System.out.println("You Win!");
            }
            
            
            
        }
    }
    
}
