
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make a new scanner
        Scanner input = new Scanner (System.in);
        
        //ask user the amount of daytime minutes
        System.out.println("How many daytime minutes?");
        
        //make variable for daytime minutes
        int dm = input.nextInt();
        
        //ask user the amount of evening minutes
        System.out.println("How many evening minutes?");
        
        //make variable for evening minutes
        int em = input.nextInt();
        
        //ask user the amount of weekend minutes
        System.out.println("How many weekend minutes?");
        
        //make variable for weekend minutes
        int wm = input.nextInt();
        
        //calculate cost of plan A
            //daytime
            double dca = (dm - 100)*0.25;
            
            //evening
            double eca = (em * 0.15);
            
            //weekdends
            double wca = (wm * 0.20);
            
            //total cost
            double tca = dca + eca + wca;
            
         //calculate cost of plan B
            //daytime
            double dcb = (dm - 250)* 0.45;
            
            //evening
            double ecb = em * 0.35;
            
            //weekends
            double wcb = wm * 0.25;
            
            //total cost
            double tcb = dcb + ecb + wcb;
            
         //tell user the cost for Plan A
            System.out.println("Plan A costs " + tca);
            
         //tell user the cost for plan B
            System.out.println("Plan B costs " + tcb);
         
            
         //tell user which plan is cheaper
         if (tca > tcb){
             System.out.println("Plan B is cheapest");
         }else if (tca < tcb){
             System.out.println("Plan A is cheapest");
         }
            
        //close scanner
         input.close();
    }
    
}
