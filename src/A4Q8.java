
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author farrb0382
 */
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int spot = 1;
        int roll = 0;

        while (spot != 100) {
            System.out.println("Please enter the sum of the dice between 2 and 12.");
            roll = input.nextInt();
            if (roll >= 2 || roll <= 12) {
                spot = spot + roll;
                System.out.println("You are now on spot " + spot);
            }

            if (roll > 12 || roll < 2) {
                spot = spot - roll;
                System.out.println("Invalid roll please go again");
            }

            if (spot > 100) {
                System.out.println("You rolled past 100.");
                spot = spot - roll;
                System.out.println("You were put back to spot " + spot);
            }

            if (spot == 100) {
                System.out.println("Congratulations! You win!");
            }

            if (spot == 9) {
                spot = 34;
                System.out.println("You have just climbed a ladder. You are on spot " + spot);
            }

            if (spot == 40) {
                spot = 64;
                System.out.println("You have just climbed a ladder. You are on spot " + spot);
            }

            if (spot == 67) {
                spot = 86;
                System.out.println("You have just climbed a ladder. You are on spot " + spot);
            }

            if (spot == 99) {
                spot = 77;
                System.out.println("You have just slid down a snake. You are now on spot" + spot);
            }

            if (spot == 90) {
                spot = 48;
                System.out.println("You have just slid down a snake. You are now on spot " + spot);

            }

            if (spot == 54) {
                spot = 19;
                System.out.println("You have just slid down a snake. You are on spot " + spot);
            }
        }
    }
}
