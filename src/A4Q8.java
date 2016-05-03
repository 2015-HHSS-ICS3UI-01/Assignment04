
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author halll7908
 */
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        boolean done = false;

        int spot = 1;
        while (!done) {
            // game
            System.out.println("Roll the dice. What was your roll?");
            int roll = input.nextInt();
            spot = spot + roll; 
            
            // invalid roll
            if (spot > 100) {
                System.out.println("Invalid roll. Roll again.");
                spot = spot - roll;
            } else {
            System.out.println("You're now on space " + spot);
            }
            
            // exceptions 
            if (roll < 2 || roll > 12) {
                System.out.println("You Quit!");
                done = true;
            }
            if (spot == 9) {
                spot = 34;
                System.out.println("You went up a ladder! You're now on space " + spot);
            }
            if (spot == 40) {
                spot = 64;
                System.out.println("You went up a ladder! You're now on space " + spot);
            }
            if (spot == 54) {
                spot = 19;
                System.out.println("You slid down a snake. You're now on space " + spot);
            }
            if (spot == 67) {
                spot = 86;
                System.out.println("You went up a ladder! You're now on space " + spot);
            }
            if (spot == 90) {
                spot = 48;
                System.out.println("You slid down a snake. You're now on space " + spot);
            }
            if (spot == 99) {
                spot = 77;
                System.out.println("You slid down a snake. You're now on space " + spot);
            }
            
            if (spot == 100) {
                System.out.println("You Win!");
                done = true;
            }
        }
    }
}
