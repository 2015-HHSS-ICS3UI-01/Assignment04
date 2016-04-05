
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author voigr4865
 */
public class A4Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        boolean done = false;


        int spot = 1;
        int spot1 = 1;
        while (!done) {
            System.out.println("player 1 what is your roll");
            int roll = input.nextInt();
            spot = spot + roll;

            if (spot > 100) {
                System.out.println("You are over 100 please roll again");
                spot = spot - roll;
                System.out.println("You are now on sace " + spot);
            } else {
                System.out.println("You are now on space " + spot);
            }

            if (roll < 2 || roll > 12) {
                System.out.println("invalid roll you quit");
                done = true;
            }



            if (spot == 9) {
                spot = 34;
                System.out.println("You landed on a ladder you are now on space " + spot);
            }

            if (spot == 40) {
                spot = 64;
                System.out.println("You landed on a ladder you are now on space " + spot);
            }
            if (spot == 54) {
                spot = 19;
                System.out.println("Uh oh you landed on a snake you are now on space " + spot);
            }
            if (spot == 67) {
                spot = 86;
                System.out.println("You landed on a ladder you are now on space " + spot);
            }
            if (spot == 90) {
                spot = 48;
                System.out.println("Uh oh you landed on a snake you are now on space " + spot);
            }
            if (spot == 99) {
                spot = 77;
                System.out.println("Uh oh you landed on a snake you are now on space " + spot);
            }

            if (spot == 100) {
                System.out.println("Player 1 wins!");
                done = true;
            } else if (spot != 100) {
                System.out.println("Player 2 what is your roll");
                int roll1 = input.nextInt();
                spot1 = spot1 + roll1;
                
                if (spot1 > 100) {
                    System.out.println("You are over 100 please roll again");
                    spot1 = spot1 - roll1;
                    System.out.println("You are now on sace " + spot1);
                } else {
                    System.out.println("You are now on space " + spot1);
                }

                if (roll1 < 2 || roll1 > 12) {
                    System.out.println("invalid roll you quit");
                    done = true;
                }
                if (spot1 == 9) {
                spot1 = 34;
                System.out.println("You landed on a ladder you are now on space " + spot1);
            }

            if (spot1 == 40) {
                spot1 = 64;
                System.out.println("You landed on a ladder you are now on space " + spot1);
            }
            if (spot1 == 54) {
                spot1 = 19;
                System.out.println("Uh oh you landed on a snake you are now on space " + spot1);
            }
            if (spot1 == 67) {
                spot1 = 86;
                System.out.println("You landed on a ladder you are now on space " + spot1);
            }
            if (spot1 == 90) {
                spot1 = 48;
                System.out.println("Uh oh you landed on a snake you are now on space " + spot1);
            }
            if (spot1 == 99) {
                spot1 = 77;
                System.out.println("Uh oh you landed on a snake you are now on space " + spot1);
            }
            if (spot1 == 100){
                System.out.println("Player 2 wins!");
                done = true;
            }
                

            }

        }
    }
}