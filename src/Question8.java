
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new Scanner to read in values
        Scanner in = new Scanner(System.in);

        // create an integer to store a variable 
        int spot = 1;
        int total;

        // Will make sure spot stays below or equal to 100
        while (spot <= 100) {
            System.out.println("Enter Sum of Dice: ");
            total = in.nextInt();

            // Indicates what square the user's peice is on
            spot = total + spot;

            // The spot must be below 100
            if (spot < 100) {
                System.out.println("You are now on square: " + (spot));
            }
            // If user rolls a 0 then they quit 
            if (spot == 0) {
                System.out.println("To Bad, You Quit!");
                break;
            }
            // If the user's peice lands at the bottom of a latter they climb up it
            if (spot == 9) {
                System.out.println("Look a Latter! You've climbed up to square " + 34);
                spot = 34;
            }
            // If the user's peice lands at the bottom of a latter they climb up it
            if (spot == 40) {
                System.out.println("Look a Latter! You've climbed up to square " + 64);
                spot = 64;
            }
            // If the user's peice lands on a snakes head they go down it
            if (spot == 54) {
                System.out.println("Oh No A Snake!! You've gone down to square " + 19);
                spot = 19;
            }
            // If the user's peice lands at the bottom of a latter they climb up it
            if (spot == 67) {
                System.out.println("Look a Latter! You've climbed up to square " + 86);
                spot = 86;
            }
            // If the user's peice lands on a snakes head they go down it
            if (spot == 90) {
                System.out.println("Oh No A Snake!! You've gone down to square " + 48);
                spot = 48;
            }
            // If the user's peice lands on a snakes head they go down it
            if (spot == 99) {
                System.out.println("Oh No A Snake!! You've gone down to square " + 77);
                spot = 77;
            }
            // If the user's peice equals 100 then the game stops
            if (spot == 100) {
                System.out.println("You Win!");
                break;
            }
            // If the user rolls and the total causes the peice to exceed 100 then he will role again
            if (spot > 100) {
                System.out.println("Nope! Reroll ");
                spot = spot - total;
            }

        }


    }
}
