
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
        int limit = input.nextInt();

        System.out.println("Enter the recorded speed of the car.");
        int speed = input.nextInt();

        int answer = limit - speed;

        //CHECK INT NAMES
        if (answer <= 0) {
            System.out.println("Congradulation, you are within the speed limit!");
        } else if (answer >= 1 && answer <= 20) {
            System.out.println("You are speeding. Your fine is $100!");
        } else if (answer >= 21 && answer <= 30) {
            System.out.println("You are speeding. Your fine is $270!");
        } else if (answer >= 31) {
            System.out.println("You are speeding. Your fine is $500!");
        }
    }
}