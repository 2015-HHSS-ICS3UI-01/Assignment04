
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coulh9904
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
                System.out.println("Please enter your FIRST number.");
                double A = input.nextDouble();   
                System.out.println("Please enter your SECOND number.");
                double B = input.nextDouble(); 
                System.out.println("Please enter your THIRD number.");
                double C = input.nextDouble(); 
                System.out.println("Please enter your FOURTH number.");
                double D = input.nextDouble(); 
                System.out.println("Your numbers were "+ A + ", " + B + ", " + C + ", and " + D );
    }
}
