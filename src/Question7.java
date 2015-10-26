
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jon
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program that will collect the speed limit and the speed of the car
        // and then determine if there is a fine, if so how much

        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        // ask the speed limit and collect the information
        System.out.print("Enter the speed limit: ");
        double speedLimit = input.nextDouble();
        
        // ask speed of car and collect the information
        System.out.print("Enter the recorded speed of the car: ");
        double speedCar = input.nextDouble();
        
        // create variable for the number of km/h over
        double speedOver;
        
        // create a variable for the fine given
        double fine;
        
        // if the speed of the car is over the speedlimit then find the km/h over
        // and then determine the fine to display the outcome
        if(speedCar > speedLimit){
            // determine how much is the car speed oover the speed limit
            speedOver = speedCar - speedLimit;
            // if the speed over is between 1 and 20 the fine is therefore $100
            if(speedOver >= 1.0 && speedOver <= 20.0){
                fine = 100.0;
            // if the speed over is between 21 and 30 the fine is therefore $270
            } else if (speedOver >= 21.0 && speedOver <= 30.0){
                fine = 270.0;
            // if the speed over is between 31 and over the fine is therefore $500
            } else {
                fine = 500.0;
            }
            System.out.println("You are speeding a your fine is $" + fine + ".");
        // if the speed of the car is within the speed limit than tell the driver they are within the limit
        } else {
            System.out.println("Congratulations, you are within the speed limt!");
        }
        // close input scanner
        input.close();
    }
    
}
