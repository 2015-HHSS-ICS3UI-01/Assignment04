
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input scanner
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the speed limit: ");
        int speedLimit = input.nextInt();
        
        System.out.println("Enter the recorded speed of the car: ");
        int speed = input.nextInt();
        
        if(speed < speedLimit || speed == speedLimit) {
            System.out.println("Congratulations, you are within the speed limit!");
        } else if(speed > speedLimit && speed <= speedLimit + 20){
            System.out.println("You are speeding and your fine is $100");
        } else if(speed > speedLimit + 20 && speed <= speedLimit + 30) {
            System.out.println("You are speeding and your fine is $270");
        } else if(speed > speedLimit + 31) {
            System.out.println("You are speeding and your fine is $500");
        }
        
        
        
        
        
    }
}
