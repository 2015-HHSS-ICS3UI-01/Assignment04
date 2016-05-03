
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halll7908
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("I will tell you which plan is cheaper.");
        
        System.out.println("Please input the daytime minutes.");
        double d = input.nextDouble();
        double dt1 = (d - 100) * 0.25;
        if ( dt1 < 0 ) {
                dt1 = 0;
            }
        double dt2 = (d - 250) * 0.45;
            if ( dt2 < 0 ) {
                dt2 = 0;
            }
        
        System.out.println("Input the evening minutes.");
        double e = input.nextDouble();
        double et1 = e * 0.15;
        double et2 = e * 0.35;
        
        System.out.println("Input the weekend minutes.");
        double w = input.nextDouble();
        double wt1 = w * 0.20;
        double wt2 = w * 0.25;
        
        // totals
        double t1 = dt1 + et1 + wt1;
        double t2 = dt2 + et2 + wt2;
        
        System.out.println("Plan A is: $" + t1 + ".");
        System.out.println("Plan B is: $" + t2 + ".");
        
        if ( t1 > t2 ) {
            System.out.println("Plan B is cheaper.");
        }   else if ( t1 < t2 ) {
            System.out.println("Plan A is cheaper.");
        }   else {
            System.out.println("The plans cost the same amount.");
        }
    }
}
