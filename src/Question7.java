
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rahmf8586
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the speed limit:");
        int lim = input.nextInt();

        System.out.println("Enter the recorded speed of the car:");
        int speed = input.nextInt();

        int diff = speed - lim;

        boolean done = false;
        while (!done) {

            if (diff <= 0) {
                System.out.println("Congratulations, you are within the speed limit!");
            } else if (diff <= 20 && diff >= 1) {
                System.out.println("You are speeding and your fine is 100$.");
            } else if (diff <= 30 && diff >= 21) {
                System.out.println("You are speeding and your fine is 270$.");
            } else if (diff >= 31) {
                System.out.println("You are speeding and you fine is 500$.");
            }
            done = true;
        }
        input.close();
    }
}