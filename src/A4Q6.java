
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author voigr4865
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Number of daytime minutes?");
        double a = input.nextDouble();
        double b1 = (a - 100) *0.25;
        double b2 = (a - 250) *0.45;
        if (b1 < 0){
            b1 = 0;
        }
        if (b2 < 0){
            b2 = 0;
        }
        
        
        System.out.println("Number of evening minutes?");
        double b = input.nextDouble();
        double e1 = (b *0.15);
        double e2 = (b *0.35);
        
        System.out.println("Number of weekend minutes");
        double c = input.nextDouble();
        double c1 = (c *0.20);
        double c2 = (c *0.25);
        
        double plana = (b1 + e1 + c1);
        double planb = (b2 + e2 + c2);
        
        System.out.println("Plan A $" + plana);
        System.out.println("Plan B $" + planb);
        
        if (plana > planb){
            System.out.println("Plan B is cheaper");
        }
        if (plana < planb){
            System.out.println("PLan A is cheaper");
        }
        if (plana == planb){
            System.out.println("Both plans are equal");
        }
        
    }
}
