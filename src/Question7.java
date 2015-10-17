
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the speed limit:");
        int limit = in.nextInt();
        
        System.out.println("Enter the recorded speed of the car:");
        int speed = in.nextInt();
        int difference = (speed - limit);
        if(limit >= speed){
            System.out.println("Congratulations, you are within the speed limit!");
        }if(limit < speed){
            
            if(difference <= 20){
            System.out.println("You are speeding and your fine is $100");
        
    }else if
            (difference <= 30 ){
                System.out.println("You are speeding and your fine is $270.");
    
    }else if(difference > 31){
                System.out.println("You are speeding and your fine is $500.");
                
    }
    }
    
}
}
