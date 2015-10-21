
import java.util.Scanner;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author whitb0039
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner in = new Scanner(System.in);
        //make new scanner

        System.out.println("Please enter speed limit:");
        //ask user for the speed limit

        int spdLimit = in.nextInt();
        //the next input is the speed limit

        System.out.println("Please enter the speed you were going:");
        //ask user for the speed they were driving

        int carSpd = in.nextInt();
        //next input is the speed the car was going

        int limitOver = carSpd - spdLimit;
        //subtract the speed limit from the car speed

        if (limitOver < 0) {
            System.out.println("Congratulations, you are within the speed limit.");
        } //tell the user they are within the speed limit
        else if (limitOver > 0 & limitOver < 21) {
            System.out.println("You are speeding, fine of $100.");
        } //tell the user they are 0-20 kph over the speed limit, fine of $100
        else if (limitOver > 20 & limitOver < 31) {
            System.out.println("You are speeding, fine of $270.");
        } //tell the user they are 21-30 kph over the speed limit, fine of $270
        else if (limitOver > 30) {
            System.out.println("You are speeding, fine of $500.");
        }
        //tell the user they are 30+ kph over the speed limit, fine of $500



    }
}
