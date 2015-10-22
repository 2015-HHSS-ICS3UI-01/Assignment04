
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dawsr2694
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create Scanner
        Scanner input = new Scanner(System.in);

        //Get user information
        System.out.print("Enter the speed limit: ");
        int limit = input.nextInt();

        System.out.print("Enter the recorded speed of the car: ");
        int speed = input.nextInt();

        //Calculate how much they were over
        int over = speed - limit;

        //Inform user if they are within the speed limit
        if (speed <= limit) {
            System.out.println("Congratulations! you are within the speed limit.");
        }

        //If not, tell them their fine.
        //If they are anywhere up to 20 over:
        if (over >= 1 && over <= 20) {
            System.out.println("You are speeding and your fine is $100.");
        }
        //If they are anywhere between 20-30 over:
        if (over >= 21 && over <= 30) {
            System.out.println("You are speeding and your fine is $270");
        }
        //if they are 31 or above
        if (over >= 31) {
            System.out.println("You are speeding and your fine is $500.");
        }
    }
}
