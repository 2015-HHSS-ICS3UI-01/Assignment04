
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pintm1551
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pos = 1;                                 //Store Name
        int dice = 0;
        while (pos != 100) {
            System.out.println("Enter the sum of the dice player ");
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
                System.out.println("You Quit");
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
            System.out.println("You are now on square " + pos);
        }
    }
}
