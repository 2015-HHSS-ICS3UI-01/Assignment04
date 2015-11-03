
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author agott2059
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//create scanner
        Scanner input = new Scanner(System.in);
//get speed limit, store as integer
        System.out.println("Enter your speed: ");
        int speed = input.nextInt();
//get speed, store as integer
        System.out.println("Enter the speed limit: ");
        int speedLimit = input.nextInt();
//find differance between speed and speed limit (automatically asume speed is larger)
        if (speed <= speedLimit) {
//if speed is within speed limit, tell user then end program            
            System.out.println("You are within the speed limit.");
        } else {
//find differance between speed and speed limt
            int diff = (speed - speedLimit);
//calculate fine by comparing difference to the given information of the fine brackets
//keep checking until appropriate fine bracket is found
            if (diff <= 20) {
                System.out.println("You are going " + diff + "km/h over and your fine is $100.");
            } else if (diff <= 30) {
                System.out.println("You are going " + diff + "km/h over and your fine is $270.");
            } else if (diff > 30) {
                System.out.println("You are going " + diff + "km/h over and your fine is $500.");
            }
        }
    }
}
