
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prevw5940
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //asks to input the speed limit
        System.out.print("Enter the speed limit: ");
        double speedLimit = input.nextInt();
        //asks to input the recorded speed of the car
        System.out.print("Enter the recorded speed of the car: ");
        double carSpeed = input.nextInt();
        //if the car speed is under the speed limit, there is no penalty
        if(carSpeed-speedLimit < 0)
        {
            System.out.print("Congratulations, you are within the speed limit! ");
        } 
        //if the car speed is over the speed limit by 1 through 20, the penalty is a $100 fine
        else if (carSpeed-speedLimit >0 && carSpeed-speedLimit <21)
        {
            System.out.print("You are speeding and your fine is $100.");
        } 
        //if the car speed is over the speed limit by 21 through 30, the penalty is a $270 fine
        else if (carSpeed-speedLimit >20 && carSpeed-speedLimit <31)
        {
            System.out.print("You are speeding and your fine is $270.");
        }
        //if the car speed is over the speed limit by over 30, the penalty is a $500 fine
        else if (carSpeed-speedLimit >30)
        {
            System.out.print("You are speeding and your fine is $500.");
        }
    }
}
