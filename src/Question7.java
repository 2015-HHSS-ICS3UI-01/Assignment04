
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mitrm7692
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a new Scanner
        Scanner input = new Scanner(System.in);
        
        // Make Scanner ask speed limit
        System.out.println("Please enter the speed limit");

        //Enter speed limit
        int speedLimit = input.nextInt();
        
        // Make Scanner ask for vehicles speed
        System.out.println("Please enter the speed of the vehicle");

        //Enter the vehicles speed
        int carSpeed = input.nextInt();
        
        //Calculate how much over the speed limit the user is 
        int speedOver = carSpeed - speedLimit;
       
        //If user is within the speed limit scanner says "Congratulations, you are within the speed limit!"
        if (speedOver<0){
            System.out.println("Congratulations, you are within the speed limit! ");
        }
        
        //If user is over speed limit by 1-20 scanner says "You are speeding and your fine is $100."
        else if(speedOver>0&speedOver<21){
            System.out.println("You are speeding and your fine is $100. ");
        }
        
        //If user is over speed limit by 21-30 scanner says "You are speeding and your fine is $270."
        else if(speedOver>20&speedOver<31){
            System.out.println("You are speeding and your fine is $270. ");
        }
        
        //If user is over speed limit by 31 scanner says "You are speeding and your fine is $500."
        else if(speedOver>30){
            System.out.println("You are speeding and your fine is $500. ");
        }
        
        //Finish with scanner
        input.close();
        
    }
}
