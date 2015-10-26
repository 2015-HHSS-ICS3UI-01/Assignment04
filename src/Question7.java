
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lalim9800
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creat new scanner 
        Scanner input = new Scanner(System.in);
        //ask user the speed limit 
        System.out.println("Enter the speed limit");
        //allow user to enter seed limit
        double limit = input.nextDouble();
        //ask user there speed 
        System.out.println("enter the recorded speed of the car ");
        //allow user to enter car speed 
        double speed = input.nextDouble();
        //calculate how much your were over the spee limit 
        double over = speed - limit;

        //if  the speed is over by 1 to 20 km,let the user know they are getting fined 100 dollars 
        if (over > 0 && over < 21) {
            System.out.println("you are speeding,and your fine is 100$");
        }
        //if the speed is over by 21 to  30 km then let the user know they will be fined 270 dollars 
        if (over > 20 && over < 31) {
            System.out.println("your are speeding ,and your fine is 270$");
        }

        //if the speed is over by 31km then let the user know they will be fined 500 dollars 
        if (over > 30) {
            System.out.println("you are speeding,and your fine is 500$");
        }



        //if the speed is  less than the limit,then let the user know that they are under the limit 
        if (speed < limit) {
            System.out.println("Congratulations, you are within the speed limit!  ");
        }


    }
}
