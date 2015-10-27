
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Generates a scanner
        Scanner in = new Scanner(System.in);
        // Asks the speed limit/ The speed of the car
        System.out.println("Enter the speed limit:");
        int limit = in.nextInt();

        System.out.println("Enter the recorded speed of the car:");

        int speed = in.nextInt();
        // Calculates difference 
        int difference = (speed - limit);
        // If speed is less or equal to limit then no fine
        if (limit >= speed) {
            System.out.println("Congratulations, you are within the speed limit!");
            // If difference is less/equal to 20, then fine $100
        }
        if (limit < speed) {

            if (difference <= 20) {
                System.out.println("You are speeding and your fine is $100");
                // If difference is less/equal to 30, then fine $270
            } else if (difference <= 30) {
                System.out.println("You are speeding and your fine is $270.");
                // If difference is more/equal to 31, then fine $500
            } else if (difference >= 31) {
                System.out.println("You are speeding and your fine is $500.");

            }
        }
        in.close();
    }
}
