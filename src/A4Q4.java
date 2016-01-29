


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vickj2854
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);      
  // get price of cost for prom
          
        System.out.println("How much does the food cost for prom?");
        
        double food = input.nextDouble();
        
        System.out.println("How much does the DJ cost?");
        
        double dj = input.nextDouble();
        
        System.out.println("How much does it cost to rent the hall?");
        
        double hall = input.nextDouble();
        
        System.out.println("How much do decorations cost?");
        
        double decorations = input.nextDouble();
        
        System.out.println("How much does it cost for staff?");
        
        double staff = input.nextDouble();
        
        System.out.println("How much does it cost for miscellaneous costs?");
        
        double miscellaneous = input.nextDouble();
        
        double total = food + dj + hall + decorations + staff + miscellaneous;
        
        double tickets = Math.ceil(total/ 35);
        
        System.out.println("The total cost is " + total + ". You will need to sell " + tickets + " tickets to break even.");
        
        
        
        
        
        

        

    }
}
    
