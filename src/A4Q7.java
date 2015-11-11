
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moraj0721
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Make the scanner
        Scanner input = new Scanner(System.in);

        //Ask for the speed limit
        System.out.println("Enter the speed limit.");
        int limit = input.nextInt();

        // Ask for the speed of the car
        System.out.println("Enter the recorded speed of the car.");
        int rec = input.nextInt();

        //if the car is under the speed limit
        if (rec < limit) {
            System.out.println("Congratulations, you are within the speed limit!");
        }

        int over = rec - limit;
        //If the speed exceeds the limit by 1-20 mmph

        if (over > 1 & over < 20) {
            System.out.println(" You are speeding and your fine is $100");

        }
        //If the speed exceeds the limit by 21-30 mmph
         if (over > 21 & over < 30) {
            System.out.println(" You are speeding and your fine is $270");

        }
         //If the speed limit is exceeds 31
          if (over > 31) {
            System.out.println(" You are speeding and your fine is $500");

        }









    }
}
