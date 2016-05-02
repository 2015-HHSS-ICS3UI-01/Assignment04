
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godie2014
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Double food;
  Double dj;
  Double hall;
  Double decor;
  Double staff;
   Double mis;
  Scanner input = new Scanner (System.in);
  System.out.println("How much does the food for prom cost?");
        food= input.nextDouble();
        
         System.out.println("How much does the dJ cost?");
        dj= input.nextDouble();
        
          System.out.println("How much does it cost to rent the hall? ");
        hall= input.nextDouble();
        
        
          System.out.println("How much does decorations cost?  ");
        decor= input.nextDouble();
        
           System.out.println("How much does it cost for staff?");
        staff= input.nextDouble(); 
        
           System.out.println("How much for miscellaneous costs?");
        mis= input.nextDouble(); 
        
        
        double breakeven = dj+food+staff+hall+decor+mis/ 35 ;
         System.out.println(" The total cost is $" + (food + staff + dj+ hall+ decor+ mis) );
              System.out.println("You will need to sell $" + breakeven + " to break even");
        
    }}
         
         
        
        
        
        
        
        
    

