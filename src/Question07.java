
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sami
 */
public class Question07 {

    public static void main(String[] args) {

        //make a scanner
        Scanner input = new Scanner(System.in);

        //user enters speed limit
        System.out.print("Enter the speed limit: ");
        int speedLimit = input.nextInt();

        //user enters speed of car
        System.out.print("Enter the recorded speed of the car: ");
        int carSpeed = input.nextInt();

        //three fines
        int firstFine = 100;
        int secondFine = 270;
        int thirdFine = 500;

        //checks how much they are speeding by
        int speedOver = carSpeed - speedLimit;

        //check if under speed limit by 15km/h or more
        if (speedOver < -15) {
            System.out.println("Speed up, you might be causing traffic!");
        } //check if in the speed limit
        else if (carSpeed < speedLimit && speedOver < -14) {
            System.out.println("Congratulations, you are within the speed limit!");
        } //checks if cars speed is more than speed limit
        else if (carSpeed > speedLimit) {

            //checks all 3 possibilites 
            if (speedOver > 1 && speedOver < 21) {
                System.out.println("You are speeding over by " + speedOver + "km/h, your fine is $" + firstFine + ".");
            } else if (speedOver > 21 && speedOver < 30) {
                System.out.println("You are speeding over by " + speedOver + "km/h, your fine is $" + secondFine + ".");
            } else if (speedOver > 31) {
                System.out.println("You are speeding over by " + speedOver + "km/h, your fine is $" + thirdFine + ".");
            }
        }
    }
}
