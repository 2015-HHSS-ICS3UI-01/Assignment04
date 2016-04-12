
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author howen2217
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("What is the speed limit?");
        double limit = input.nextDouble();
        //collect and store speed limit
        System.out.println("What was the recorded speed?");
        double record = input.nextDouble();
        // collect and sotre users speed
        double over = record - limit;
        if (over <= 0) {
            System.out.println("Congratulations, you are within the speed limit!");
            //if user is not over the speed limit
        }
        if (over > 0 && over < 21) {
            System.out.println("You are speeding and your fine is $100");
            // if user is between 1-20 over the speed limit
        }
        if (over > 20 && over < 31) {
            System.out.println("You are speeding and your fine is $270");
            //if user is between 21-30 over the speed limit
        }
        if (over > 30) {
            System.out.println("You are speeding and your fine is $500");
            //if user is over 30
        }

    }
}
