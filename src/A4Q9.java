
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class A4Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input scanner
        Scanner input = new Scanner(System.in);
        
        //where is the game peice
        int place = 1;
        int place2 = 1;

        while (true) {
            if (place != 100) //roll dice
            {
                System.out.println("Player A enter sum of dice: ");
            }
            int roll = input.nextInt();
            
            //force a number between 2 and 12
            if(roll < 2 || roll > 12) {
                System.out.println("You Quit!");
                break;
            }
            //snakes
            if (place + roll == 54) {
                place = 19;
            }
            if (place + roll == 90) {
                place = 48;
            }
            if (place + roll == 99) {
                place = 77;
            }
            //ladders
            if (place + roll == 9) {
                place = 34;
            }
            if (place + roll == 40) {
                place = 64;
            }
            if (place + roll == 67) {
                place = 86;
            }
            //move peice
            int moveAmount = place + roll;
            System.out.println("You are now on square " + moveAmount);
            place = place + roll;
            
            
            if (moveAmount == 100) {
                System.out.println("Player A wins!");
                break;
            }
            
            //player B
            if (place2 != 100) //roll dice
            {
                System.out.println("Player B enter sum of dice: ");
            }
            int roll2 = input.nextInt();
            
            //force a number between 2 and 12
            if(roll2 < 2 || roll2 > 12) {
                System.out.println("You Quit!");
                break;
            }
            //snakes
            if (place2 + roll2 == 54) {
                place2 = 19;
            }
            if (place2 + roll2 == 90) {
                place2 = 48;
            }
            if (place2 + roll2 == 99) {
                place2 = 77;
            }
            //ladders
            if (place2 + roll2 == 9) {
                place2 = 34;
            }
            if (place2 + roll2 == 40) {
                place2 = 64;
            }
            if (place2 + roll2 == 67) {
                place2 = 86;
            }
            //move peice
            int moveAmount2 = place2 + roll2;
            System.out.println("You are now on square " + moveAmount2);
            place2 = place2 + roll2;
            
            if (moveAmount2 == 100) {
                System.out.println("Player B wins!");
                break;
            }
        }
        
        
    }
}
