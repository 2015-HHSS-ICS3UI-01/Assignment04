
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moore3607
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //made a new scanner called "input"
        Scanner input = new Scanner(System.in);
        //makes the computer display "Enter the speed limit:" on the screen
        System.out.println("Enter the speed limit:");
        //puts the input from the user into a variable "speedlimit"
        int speedlimit = input.nextInt();
        //makes the computer display "Enter the recorded speed of the car:" on the screen
        System.out.println("Enter the recorded speed of the car:");
        //puts the input from the user into a variable "recordedspeed"
        int recordedspeed = input.nextInt();
        //makes a new variable by using previous variables
        int speed = (recordedspeed - speedlimit);
        //if speed is less than or equal to zero, the following commands will be executed
        if (speed <= 0) {
            //makes the computer display "Congratulations, you are within the speed limit!" on the screen
            System.out.println("Congratulations, you are within the speed limit!");
        }
        //if speed is less than or equal to 1 or more than or equal to 20, the following commands will be executed
        if (speed >= 1) {
            if (speed <= 20) {
                //makes the computer display "You are speeding and your fine is $100." on the screen
                System.out.println("You are speeding and your fine is $100.");
            }
        }
        //if speed is less than or equal to 21 or more than or equal to 30, the following commands will be executed
        if (speed >= 21) {
            if (speed <= 30) {
                //makes the computer display "You are speeding and your fine is $270." on the screen
                System.out.println("You are speeding and your fine is $270.");
            }
        }
        //if speed is more than or equal to 31, the following commands will be executed
        if (speed >= 31) {
            //makes the computer display "You are speeding and your fine is $500." on the screen
            System.out.println("You are speeding and your fine is $500.");
        }






    }
}
