
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter in 4 numbers on separate lines:");
        double num1 = in.nextDouble();
        
        double num2 = in.nextDouble();
        
        double num3 = in.nextDouble();
        
        double num4 = in.nextDouble();
        
        System.out.println("Your numbers were "+ num1 + ", "+num2+", "+ num3 +" and "+ num4);
    }
}
