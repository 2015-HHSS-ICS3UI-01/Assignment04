
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author coulh9904
 */
public class A4Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int A = 0;
        int C = 0;
        int D = 1; //Start on square one
        int E = 1;
        int X = 1; //Attempt to count turns
        while (true) {
            System.out.println("Enter sum of dice.");
            A = input.nextInt();
            if (1 < A && A < 13) {
                if (X == 1) { //Make variable C correspond with the player
                    C = D;
                } else {
                    C = E;
                }
                int B = (A + C);
                if (B == 9) {
                    B = 34;
                    System.out.println("Ladder!");
                }
                if (B == 67) {
                    B = 86;
                    System.out.println("Ladder!");
                }
                if (B == 40) {
                    B = 64;
                    System.out.println("Ladder!");
                }
                if (B == 54) {
                    B = 19;
                    System.out.println("Snake!");
                }
                if (B == 90) {
                    B = 48;
                    System.out.println("Snake!");
                }
                if (B == 99) {
                    B = 77;
                    System.out.println("Snake!");
                }
                if (B > 100) {
                    System.out.println("Your roll is over 100");
                    B = (B - A);
                }
                if (X == 1) { //Use the INT to tell if player one or two
                    D = B;
                    System.out.println("Player 1, you are now on square " + D);
                } else {
                    E = B;
                    System.out.println("Player 2, you are now on square " + E);
                }
                C = 0;
                B = 0;
                A = 0;
                X = X + 1;
                if (X > 2) {
                    X = 1;
                }
            } else {
                break;
            }
        }
        System.out.println("You quit!");
    }
}
