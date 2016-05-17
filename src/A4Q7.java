import java.util.Scanner;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pearr2740
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
   Scanner input = new Scanner (System.in);
   
   System.out.print("Enter speed limit;");
   double LMT = input.nextDouble();
   
   System.out.println("Enter the recorded speed limit of the car");
   double SPD = input.nextDouble();
   
   double speeding = SPD - LMT;
   
   if (speeding > 0&& speeding <21);{
    System.out.println("Your fine is $100");    
    }
    if (speeding > 20&& speeding <31);{
    System.out.println("Your fine is $100");    
    }
     if (speeding > 30){
    System.out.println("Your fine is $100");    
    }
     else if(SPD < LMT){
         System.out.println(" Congratulations, you're uner the speed limit");
     }
    }
}
