
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coulh9904
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
                Scanner input = new Scanner(System.in);
                System.out.println("Please enter your number in inches.");
                Double A = input.nextDouble();          
                System.out.println(A * 2.54);
    }
}
