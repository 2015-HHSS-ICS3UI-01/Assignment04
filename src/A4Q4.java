
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bettk6516
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        Scanner input= new Scanner(System.in);
        
        System.out.println("cost!");
        
        System.out.println("How much does the food for prom cost?");
        int food = input.nextInt();
        
        System.out.println("How much does the DJ cost?");
        int dJ = input.nextInt();
        
        System.out.println("How much does it cost to rent the hall?");
        int hall =input.nextInt();
        
        System.out.println("how much do decorations cost?");
        int dec =input.nextInt();
        
        System.out.println("How much does it cost for staff?");
        int staff = input.nextInt();
        
        System.out.println("how much does miscellaneous stuff cost?");
        int misc = input.nextInt();
        
        
        int cost = food + dJ + hall + dec + staff + misc;
        
        int tickets = 35;
        int ticketAmount = 0;
        while(tickets < cost){
            tickets = tickets +1;
       
        }
      
          System.out.println("");      
    
    
    
    
    }
}
