
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        Scanner input = new Scanner(System.in);
        //speed limit
        System.out.println(" Enter the speed limit ");
        int limit = input.nextInt();
        // enter the speed of the car
        System.out.println(" Enter the recorded speed of the car ");
        int speed = input.nextInt();
        
        // speed over the limit
        int speedover = speed - limit;
        
        //is the car speeding
        if (speed< limit ) {
            System.out.println(" Congratulations, you are within the speed limit! ");
            }
        //speeding in between 1 and 20 km/h over
        if (speedover>1&speedover<20) {
            System.out.println(" You are speeding and your fine is $100");
            }
        //speeding in between 21 and 30 km/h over
        if (speedover>21&speedover<30) {
            System.out.println(" You are speeding and your fine is $270");
            }
        //speeding in between 31 km/h over and above
        if (speedover>31) {
            System.out.println(" You are speeding and your fine is $500");
        }
    }
}
    
