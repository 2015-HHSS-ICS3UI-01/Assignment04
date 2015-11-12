
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eadil1765
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //Create a scanner for input
        Scanner input = new Scanner(System.in);
        
        //Get the speed of the car and the speed limit
        System.out.println("Enter the speed limit");
        double speedLimit = input.nextDouble();
        System.out.println("Enter the recorded speed of the car");
        double speedOfCar = input.nextDouble();
        
        //Tell the user if they are speeding or not
        if(speedOfCar <= speedLimit){
            System.out.println("Congratulations, you are within the recorded speed limit");
        }double difference = speedOfCar - speedLimit;
        if(difference <= 20){
            System.out.println("You are speeding and your fine is $100");
            }if(difference <= 30){
                System.out.println("You are speeding and your fine is $270");
            }if (difference >= 31){
                System.out.println("You are speeding and your fine is $500");
            }

    }
}
