
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Matt
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create input scanner
        Scanner input = new Scanner(System.in);
        
        //ask user to input limit
        System.out.println("Please enter the limit, rounded to the nearest integer.");
        int limit = input.nextInt();
        
        //ask user to input speed
        System.out.println("Please enter the speed of the car, rounded to the nearest integer.");
        int speed = input.nextInt();
        
        //integers to find out if you're speeding & how much over
        int areYouSpeeding = limit - speed;
        int howMuchOver = speed-limit;
        //if the diff between limit & speed is under 0 and over -20
        if (areYouSpeeding < 0 && areYouSpeeding > -20) {
            //tell driver he/she is speeding, at which speed, going how much over, and the fine
            System.out.println("You are speeding at " + speed + "km/h, going " + howMuchOver + "km/h over the limit, and your fine will be $100.");
        } else if (areYouSpeeding < -21 && areYouSpeeding > -30) {
            System.out.println("You are speeding at " + speed + "km/h, going " + howMuchOver + "km/h over the limit, and your fine will be $270.");
        } else if(areYouSpeeding <-31){
            System.out.println("You are speeding at " + speed + "km/h, going " + howMuchOver + "km/h over the limit, and your fine will be $500.");
        //if the driver isn't speeding, tell them that, and congratulate them!
        }else{
            System.out.println("You are legally driving at " + speed + ". Thanks!");
        }

    }
}
//(age > 12 && age <= 20)
