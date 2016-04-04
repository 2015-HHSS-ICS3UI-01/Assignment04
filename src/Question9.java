
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pintm1551
 */
public class Question9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pos = 1;                                 //Store Name
        int dice = 0;
        int plr = 1;
        int pos1 = 1;
        int pos2 = 1;
        while (pos != 100) {
            if (plr == 1) {
                pos = pos1;
            } else {
                pos = pos2;
            }
            System.out.println("Enter the sum of the dice player " + plr);
            Scanner input = new Scanner(System.in);        //Create Scanner
            dice = input.nextInt();
            if (dice >= 2 && dice <= 12) {
                if (dice + pos > 100) {
                    System.out.println("Your roll is past 100, please roll again");
                }
                if (dice + pos <= 100) {
                    pos = pos + dice;
                }
            } else {
                System.out.println("Player " + plr + " has broken the rules!");
                break;
            }
            if (pos == 54) {
                pos = 19;
                System.out.println("You slid down a snake!");
            }
            if (pos == 90) {
                pos = 48;
                System.out.println("You slid down a snake!");
            }
            if (pos == 99) {
                pos = 77;
                System.out.println("You slid down a snake!");
            }
            if (pos == 9) {
                pos = 34;
                System.out.println("You climbed a ladder!");
            }
            if (pos == 40) {
                pos = 64;
                System.out.println("You climbed a ladder!");
            }
            if (pos == 67) {
                pos = 86;
                System.out.println("You climbed a ladder!");
            }
            if (pos != 100) {
                System.out.println("Player " + plr + " is now on square " + pos);
                if (plr == 1) {
                    pos1 = pos;
                } else {
                    pos2 = pos;
                }
                if (plr == 1) {
                    plr = 2;
                } else {
                    plr = 1;
                }
            } else {
                System.out.println("Player " + plr + " has won the game!");
            }
        }
    }
}
