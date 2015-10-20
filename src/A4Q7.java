
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bettk6516
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  //imports Scanner to allow user imput
        Scanner input =new Scanner(System.in);
   
   //user enters the speed limit
        System.out.println("Ener the speed limit");
                int limit = input.nextInt();
        //user enters speed of car
                System.out.println("enter record speed of the car");
                int speed =input.nextInt();
 //if the speed is less then the limit they are not speeding               
                if(limit > speed){
                    System.out.println("congradulations, you are within the speed limit");
                }
    //if the speed is over the limit they are speeding 
                if (limit < speed){
                    //if the speed  is less then or equal to the limit +20 they are fined $100
                    if(speed <= limit + 20 ){
                        System.out.println("you are speeding, your fine is $100");
                    }
                    //if the speed is less then or equal to the limit +30 they are fined $270
                if(speed <= limit +30 ){
                    System.out.println("you are speeding your fine is $270");
                }
                //if the speed is grater then or equal to the limit +31 they are fined $500
                if(speed >= limit +31){
                    System.out.println("you are speeding your fine is $500");
                }
                
                }
    
    
    }
}
