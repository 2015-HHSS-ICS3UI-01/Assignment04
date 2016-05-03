
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author coulh9904
 */
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int A = 0; //Dice
        int C = 1; //Saved position
        while (true) {
            System.out.println("Enter sum of dice.");
            A = input.nextInt();
            if (1 < A && A < 13) {
                int B = (A + C); //Calculate new position
                if (B == 9){
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
                System.out.println("You are now on square " + B);
                C = B; //Save new postion for next roll
                B = 0; //Reset square number
                A = 0; //Reset dice number
            } else {
                break;
            }
        }
        System.out.println("You quit!");
    }
}