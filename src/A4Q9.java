
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author farrb0382
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
        int rolla = 0;
        int spot2 = 1;
        int rollb = 0;

        while (spot1 != 100) {
            System.out.println("Player 1, please enter the sum of the dice between 2 and 12.");
            rolla = input.nextInt();
            if (rolla >= 2 || rolla <= 12) {
                spot1 = spot1 + rolla;
                System.out.println("You are now on spot " + spot1);
            }

            if (rolla > 12 || rolla < 2) {
                spot1 = spot1 - rolla;
                System.out.println("Invalid roll please go again");
            }

            if (spot1 > 100) {
                System.out.println("You rolled past 100.");
                spot1 = spot1 - rolla;
                System.out.println("You were put back to spot " + spot1);
            }

            if (spot1 == 9) {
                spot1 = 34;
                System.out.println("You have just climbed a ladder. You are on spot " + spot1);
            }

            if (spot1 == 40) {
                spot1 = 64;
                System.out.println("You have just climbed a ladder. You are on spot " + spot1);
            }

            if (spot1 == 67) {
                spot1 = 86;
                System.out.println("You have just climbed a ladder. You are on spot " + spot1);
            }

            if (spot1 == 99) {
                spot1 = 77;
                System.out.println("You have just slid down a snake. You are now on spot" + spot1);
            }

            if (spot1 == 90) {
                spot1 = 48;
                System.out.println("You have just slid down a snake. You are now on spot " + spot1);

            }

            if (spot1 == 54) {
                spot1 = 19;
                System.out.println("You have just slid down a snake. You are on spot " + spot1);
            }
            if (spot1 == 100) {
                System.out.println("Congratulations! Player 1 wins!");
                done = true;
            } else if (spot1 != 100) {
                System.out.println("Player 2, please enter the sum of dice between 2 and 12.");
                rollb = input.nextInt();
                if (rollb >= 2 || rollb <= 12) {
                    spot2 = spot2 + rollb;
                    System.out.println("You are now on spot " + spot2);
                }
                
                if (spot2 > 100) {
                System.out.println("You rolled past 100.");
                spot2 = spot2 - rolla;
                System.out.println("You were put back to spot " + spot2);
                }
                
                if (spot2 == 9) {
                    spot2 = 34;
                    System.out.println("You have just climbed a ladder. You are on spot " + spot2);
                }

                if (spot2 == 40) {
                    spot2 = 64;
                    System.out.println("You have just climbed a ladder. You are on spot " + spot2);
                }

                if (spot2 == 67) {
                    spot2 = 86;
                    System.out.println("You have just climbed a ladder. You are on spot " + spot2);
                }

                if (spot2 == 99) {
                    spot2 = 77;
                    System.out.println("You have just slid down a snake. You are now on spot " + spot2);
                }

                if (spot2 == 90) {
                    spot2 = 48;
                    System.out.println("You have just slid down a snake. You are now on spot " + spot2);

                }

                if (spot2 == 54) {
                    spot2 = 19;
                    System.out.println("You have just slid down a snake. You are on spot " + spot2);
                }
            }
        }
    }
}