
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         String name;
        
         Scanner input = new Scanner(System.in);
         
         System.out.println("Number of daytime minutes?");
         double A = input.nextDouble();
         System.out.println("Number of evening minutes?");
         double B = input.nextDouble();
         System.out.println("Number of weekend minutes?");
         double C = input.nextDouble();
         System.out.println("Plan A costs $" + (((A-100)*.25) + (B*.15) + (C*.20)));
         System.out.println("Plan B costs $" + (((A-250)*.45) + (B*.35) + (C*.25)));
         
        if ((((A-100)*.25) + (B*.15) + (C*.20)) > (((A-250)*.45) + (B*.35) + (C*.25))){
        System.out.println("Plan B is the cheaper plan.");}
        else if ((((A-100)*.25) + (B*.15) + (C*.20)) < (((A-250)*.45) + (B*.35) + (C*.25))){
        System.out.println("Plan B is the cheaper plan.");}
        else if ((((A-100)*.25) + (B*.15) + (C*.20)) == (((A-250)*.45) + (B*.35) + (C*.25))){
        System.out.println("Plan A and B are the same price.");}
        }
}


