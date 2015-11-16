
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malcr1272
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner in = new Scanner(System.in);
        
        //ask question
        System.out.println("What is the number of inches you wish to convert?");
        int inches = in.nextInt();
        
        //multiply inches to cm
        double answer = inches*2.54;
        
        System.out.println(inches +" inches is the same as " + answer + "cm");
        
       
        
        
    }
}
