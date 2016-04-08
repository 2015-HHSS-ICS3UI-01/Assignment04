
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

        int answer = speed - limit;

        if (answer <= 0) {
            System.out.println("Congradulation, you are within the speed limit!");
        } else if (1 <= answer && answer <= 20) {
            System.out.println("You are speeding. Your fine is $100!");
        } else if (21 <= answer && answer <= 30) {
            System.out.println("You are speeding. Your fine is $270!");
        } else if (answer >= 31) {
            System.out.println("You are speeding. Your fine is $500!");
        }
    }
}
