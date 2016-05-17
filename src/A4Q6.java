import java.util.Scanner;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pearr2740
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner input = new Scanner(System.in);
 
   System.out.println("Number of daytime minutes");
   double day = input.nextDouble();
   
   System.out.println("Number of evening minutes?");
   double even = input.nextDouble();

   System.out.println("Number of weekend minutes");
   double week = input.nextDouble();
   
   double dayMin = (day - 100) *25;
   double evenMin = (even * 0.15);
   double weekMin = (week * 0.25);
   
   double PlanA = (dayMin + evenMin + weekMin);
   
   double dayMin2 = (day - 250) *45; 
   double evenMin2 = (even * 35);
   double weekMin2 = (week * 25);
   
   double PlanB = (dayMin2 + evenMin2 + weekMin2);
   
   System.out.println("Plan A will cost $" + PlanA);
   System.out.println("Plan B will cost $" + PlanB);
   
   
   
   
   
   
   
   
   
    
    
    }
}
