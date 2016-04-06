
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         String name;
        
         Scanner input = new Scanner(System.in);
         
         System.out.println("Enter the speed limit: ");
         int speed = input.nextInt();
         System.out.println("Enter the recorded speed of the car: ");
         int car = input.nextInt();
         
         if (car < speed){
             System.out.println("Congratulations, you are within the speed limit!");
         }
         if ((car - speed) <= 20)
         System.out.println("You will receive a fine of $100.");
         if ((car - speed) <= 30)
         System.out.println("You will receive a fine of $270.");
         if ((car - speed) >= 31)
         System.out.println("You will receive a fine of $500.");
         
    }
}
