
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pircn0556
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        
        //Ask speed limit
        System.out.println("Enter the speed limit:");
        int limit = input.nextInt();
        
        //Ask recorded speed
        System.out.println("Enter the recorded speed of the car:");
        int speed = input.nextInt();
       
        int carspeed = speed-limit;
        
        //See if over limit + fine owed
        if(carspeed<=20 && carspeed>=1){
            System.out.println("You are speeding and for fine is $100.");
        }else if(carspeed<=30 && carspeed>=21){
            System.out.println("You are speeding and your fine is $270.");
        }else if(carspeed<10000 && carspeed>=31){
            System.out.println("You are speeding and your fine is $500.");
        }else{
            System.out.println("Congratulations, you are within the speed limit!");
        }
    }
}
