
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new Scanner to read in values
        Scanner in = new Scanner(System.in);

        // create an integer to store a variable for speed
        int speed;
        int speedlimit;
        int $F100;
        int $F270;
        int $F500;

        // The spped limit of the road
        System.out.println("Enter the speed limit: ");
        speedlimit = in.nextInt();

        // The speed that the users car is driving at 
        System.out.println("Enter the recorded speed of the car: ");
        speed = in.nextInt();

        // Output our sentence to the user letting them know what they entered
        if (speed < speedlimit) {
            System.out.println("Congratulations, you are within the speed limit!");
        } else if (speed > speedlimit) {


            System.out.println("You are speeding and your fine is:");
            // The amount of speed went over the speed limit
            int difference = (speed - speedlimit);

            // Will be fined $100 according to the difference 
            if (difference <= 20) {
                System.out.println("$100");
                $F100 = in.nextInt();
            } // Will be fined $270 according to the difference 
            else if (difference <= 30) {
                System.out.println("$270");
                $F270 = in.nextInt();
            } // Will be fined $500 according to the difference  
            else if (difference >= 31) {
                System.out.println("$500");
                $F500 = in.nextInt();
            }


        }



    }
}
