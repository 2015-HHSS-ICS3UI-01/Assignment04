
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fitws6356
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int position = 1;

        while (position <= 100) {
            //input a program that penalizes the player for rolling improperly
            System.out.println("Roll Dice and enter what you rolled.");
            int dice = input.nextInt();
            if (dice < 2 || dice > 12) {
                System.out.println("You Quit!");
                System.exit(0);
            } else {
                position = dice + position;
            }   //input a program that adds locations for the snakes and the ladders
            System.out.println("You are now on space " + position);
            if (position == 9) {
                position = 34;

            } else if (position == 40) {
                position = 64;
            } else if (position == 54) {
                position = 19;
            } else if (position == 67) {
                position = 86;
            } else if (position == 90) {
                position = 48;

            } else if (position == 99) {
                position = 77;
            }//input a program that signals when the player has reached 100
            if (position > 100) {
                position = 100;
                break;
            }
        }

        System.out.println("You win!");

    }
}
