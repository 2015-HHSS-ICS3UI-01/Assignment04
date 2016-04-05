
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author voigr4865
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input a measurement in inches");
        
        
        
        int inch = input.nextInt();
        double number = 2.54 *inch; 
        System.out.println(number + "cm");
        
        
    }
}
