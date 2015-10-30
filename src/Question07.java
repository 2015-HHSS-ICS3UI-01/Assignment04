
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alled7036
 */
public class Question07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //make new scanner
        
        Scanner input = new Scanner(System.in);
        
        //Ask Questions 
        System.out.print("Enter the speed limit: ");
        int speedLimit = input.nextInt();
        
        System.out.print("Enter the speed you were going: ");
        int yourSpeed = input.nextInt();
        
        int speedOver = yourSpeed - speedLimit;
        
        
        //Determine the speed penilties
        if(speedLimit > yourSpeed){
            System.out.println("You are in the speed limit! ");
        } else if(speedOver > 1 && speedOver < 21){
            System.out.println("You're speeding fined $100 ");
        } else if(speedOver > 21 && speedOver < 31){
            System.out.println("You're speeding fined $270 ");
        } else if( speedOver > 31){
            System.out.println("You're speeding fined $500 ");
        }
           
       
            
        
        
        
        
                
    }
}
