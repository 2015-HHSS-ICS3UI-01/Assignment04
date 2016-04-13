/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author singk4158
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        //create new scanner
        Scanner input = new Scanner(System.in);
 
        System.out.println("Enter speed limit");
        int limit = input.nextInt();
        
        System.out.println("Enter recorded speed of the car");
       
        int speed = input.nextInt();
        int answer = speed - limit;
        
        //not speeding
    
        if(answer<= 0){
            System.out.println("Congradulations, you are within the speed limit");
        }//Fine $100
        else if(1 <= answer && answer <= 20) {
            System.out.println("You are speeding, the fine is $100!");
        }//Fine is $270
        else if(21 <= answer && answer <= 30) {
            System.out.println("You are speeding, your fine is $270!");
        }//Fine is $500
        
        else if(answer >= 31) {
            System.out.println("You are speeding, your fine is $500!");
        }    
    }

}

    
    
    

