
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author godie2014
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;
        Double speed;
        Double car;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the speed limit");
        speed = input.nextDouble();
        System.out.println("Enter the recorded speed of the car");
        car = input.nextDouble();
        
        
        
        System.out.println("Enter speed limit");
        int speedLimit = input.nextInt();
        
        System.out.println("Enter the recorded speed of the car:  ");
        int carspeed = input.nextInt ();
        
        if (carspeed < speedLimit || carspeed == speedLimit){
            System.out.println("Congradulations you are within the speed limit!");
            
        }else if (carspeed > speedLimit+20 && carspeed <=speedLimit+30){
                    System.out.println("You are speeding and your fine is $270");
                    
            
    }else if (carspeed > speedLimit && carspeed <= speedLimit +20){
                System.out.println("You are speeding and your fine is $100");
                
    } else if (carspeed > speedLimit +31 ){
            System.out.println("You are speeding and your fine is $500");
        
                    
                    
            }
        }
                
                
        
    }
    
    

        
