
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make scanner
        Scanner input = new Scanner (System.in);
        
        //tell user to input speed limit
        System.out.println("Please enter the speed limit.");
        
        //store the speed limit in a variable
        int speedLimit = input.nextInt();
        
        //tell user to input the car's speed
        System.out.println("Please enter the recored speed of the car. ");
        
        //store the car's speed in a variable
        int speed = input.nextInt();
        
        //determine the difference between the speed limit and the car's speed
        int difference = speed - speedLimit;
        
        //determiner the fines
        
        if (difference < 0){
            System.out.println("Congradulations, you are within the speed limit! ");
        
        
        }else if (difference > 0){
            if (difference >=1 && difference <=20){
                System.out.println("You are speeding and your fine is $100.");
            }else if (difference >=21 && difference <=30){
                System.out.println("You are speeding and your fine is $270");
            }else{
                System.out.println("You are speeding and your fine is $500");
            }
        }
        //close scanner
        input.close();
    }
}
