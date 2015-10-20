
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Generates a scanner
        Scanner in = new Scanner(System.in);
        //Asks the human various questions
        System.out.println("Number of daytime minutes?");
        int daytime = in.nextInt();
        
        System.out.println("Number of evening minutes?");
        int evening = in.nextInt();
        
        System.out.println("Number of weekend minutes?");
        int weekend = in.nextInt();
        double planA = 0;
        double planB = 0;
        // If they used less than 100 daytime minutes for  planA
            if(daytime <100){
                planA = ((evening*0.15) + (weekend*0.20));
                
            }else{
                // If daytime minutes are more than 100
                planA = ((daytime-100)*0.25 + (evening*0.15) + (weekend*0.20));
                //If they used less than 250 daytime minutes for planB
            }if(daytime < 250){
                planB= ((evening*0.35) + (weekend*0.25));
                // If they used more than 250 daytime minutes for planB
            }else{
                planB = ((daytime-250)*0.45 + (evening*0.35) + (weekend*0.25));
                
            }    
        
            
        planB = Math.round(planB*100)/100.0;
        planA = Math.round(planA*100)/100.0;
        System.out.println("Plan A costs "+ planA);
        System.out.println("Plan B costs " + planB);

            
        
        // This is analyzes comparison between both plans
        if(planA > planB){
            System.out.println("Plan B is cheapest.");
        }else if(planA < planB){
            System.out.println("Plan A is cheapest");
        }if(planA == planB){
            System.out.println("Plan A and B are the same price.");
        }
    }
}

