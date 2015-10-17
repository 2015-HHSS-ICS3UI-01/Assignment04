
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
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        System.out.println("Number of daytime minutes?");
        int daytime = in.nextInt();
        
        System.out.println("Number of evening minutes?");
        int evening = in.nextInt();
        
        System.out.println("Number of weekend minutes?");
        int weekend = in.nextInt();
        
            if(daytime <100){
                System.out.println("Plan A costs " +(evening*0.15) + (weekend*0.20));
                
            }else{
                System.out.println("");
                double planA = ((daytime-100)*0.25 + (evening*0.15) + (weekend*0.20));
            }if(daytime < 250){
                System.out.println("Plan B costs " + (evening*0.35) + (weekend*0.25));
            }else{
        double planB = ((daytime-250)*0.45 + (evening*0.35) + (weekend*0.25));
            
        
        System.out.println("Plan A costs "+ planA);
        System.out.println("Plan B costs " + planB);
        
            
        
        
        if(planA > planB){
            System.out.println("Plan B is cheapest.");
        }else if(planA < planB){
            System.out.println("Plan A is cheapest");
        }if(planA == planB){
            System.out.println("Plan A and B are the same price.");
        }
    }
}

