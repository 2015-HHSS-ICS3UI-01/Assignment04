
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malcr1272
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner in =new Scanner(System.in);
        
        //ask the speed limit
        System.out.println("Enter the speed limit");
        int limit = in.nextInt();
        
        //ask the speed
        System.out.println("Enter the recorded speed of the car");
        int speed = in.nextInt();
        
        int difference =(speed - limit);
         int fine;
        
        while(true){
       
   if (speed <= limit ){
            System.out.println("Congratulations, you are within the speed limit! ");
            break;}
            
             if (difference <= 20){
            fine = 100;
            System.out.println("You are speeding and your fine is $" + fine);
            break;
}
        
        if (difference <= 30 && difference >= 21){
            fine = 270;
        System.out.println("You are speeding and your fine is $" + fine);
        break;}
        
        if (difference >= 31){
            fine = 500;
            System.out.println("You are speeding and your fine is $" + fine);
            break;
        }
        
        
     
                     
        }
    }
}

