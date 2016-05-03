/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment04;

import java.util.Scanner;

/**
 *
 * @author singk4158
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
     Scanner input = new Scanner(System.in);
     String num;
     
        System.out.println("How much does the food for prom cost");
        double food = input.nextDouble();
        
        System.out.println("How much does the DJ cost");
        double music = input.nextDouble();
        
        System.out.println("How much does it cost to rent hall");
        double place = input.nextDouble();
        
        System.out.println("How much does decorations cost");
        double decorations = input.nextDouble();
        
        System.out.println("How much does it cost for staff");
       double staff = input.nextDouble();
       
        System.out.println("How much for miscellaneous costs");
        double other = input.nextDouble();
    
 double cost = (double)(food + music + place + decorations + staff + other);
 
   }
}
