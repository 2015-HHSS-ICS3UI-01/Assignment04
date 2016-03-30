
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author halll7908
 */
public class A4Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean done = false;

        int spot1 = 1;
        int spot2 = 1;
        while (!done) {
            // player 1
            System.out.println("PLAYER 1: Roll the dice. What was your roll?");
            int roll1 = input.nextInt();
            spot1 = spot1 + roll1;
            System.out.println("You're now on space " + spot1 + ".");

            if (spot1 == 9) {
                spot1 = 34;
                System.out.println("You went up a ladder! You're now on space " + spot1);
            }
            if (spot1 == 40) {
                spot1 = 64;
                System.out.println("You went up a ladder! You're now on space " + spot1);
            }
            if (spot1 == 54) {
                spot1 = 19;
                System.out.println("You slid down a snake. You're now on space " + spot1);
            }
            if (spot1 == 67) {
                spot1 = 86;
                System.out.println("You went up a ladder! You're now on space " + spot1);
            }
            if (spot1 == 90) {
                spot1 = 48;
                System.out.println("You slid down a snake. You're now on space " + spot1);
            }
            if (spot1 == 99) {
                spot1 = 77;
                System.out.println("You slid down a snake. You're now on space " + spot1);
            }
            
            // player 2
            System.out.println("PLAYER 2: Roll the dice. What was your roll?");
            int roll2 = input.nextInt();
            spot2 = spot2 + roll2;
            System.out.println("You're now on space " + spot2);

            if (spot2 == 9) {
                spot2 = 34;
                System.out.println("You went up a ladder! You're now on space " + spot2);
            }
            if (spot2 == 40) {
                spot2 = 64;
                System.out.println("You went up a ladder! You're now on space " + spot2);
            }
            if (spot2 == 54) {
                spot2 = 19;
                System.out.println("You slid down a snake. You're now on space " + spot2);
            }
            if (spot2 == 67) {
                spot2 = 86;
                System.out.println("You went up a ladder! You're now on space " + spot2);
            }
// FIX HERE
            if (spot2 == 90) {
                spot2 = 48;
                System.out.println("You slid down a snake. You're now on space " + spot2);
            }
            if (spot2 == 99) {
                spot2 = 77;
                System.out.println("You slid down a snake. You're now on space " + spot2);
            }
            
            // roll exceptions
            if (roll1 < 2 || roll1 > 12) {
                System.out.println("You Quit!");
                done = true;
            }
            if (roll2 < 2 || roll2 > 12) {
                System.out.println("You Quit!");
                done = true;
            }
            
            // finishing
            if (spot1 == 100) {
                System.out.println("PLAYER 1 Wins!");
                done = true;
            } else if (spot2 == 100) {
                System.out.println("PLAYER 2 Wins!");
                done = true;
            }
        }
    }
}
