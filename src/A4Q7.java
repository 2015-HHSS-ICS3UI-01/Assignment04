
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the speed limit.");
        double limit = input.nextDouble();

        System.out.println("Enter the recorded speed of the car.");
        double speed = input.nextDouble();

        double over = speed - limit;

        //GET EQUAL TO AS WELL AND CHECK INT NAMES
        if (speed >= 1 && over <= 20) {
            System.out.println("You are speeding. Your fine is $100!");
        } else if (speed >= 21 && over <= 30) {
            System.out.println("You are speeding. Your fine is $270!");
        } else if (over >= 31) {
            System.out.println("You are speeding. Your fine is $500!");
        } else if (speed <= limit) {
            System.out.println("Congradulation, you are within the speed limit!");
        }
    }
}