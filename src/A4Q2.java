
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bettk6516
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    Scanner input = new Scanner(System.in);
    
    //text out
        System.out.println("pleasse enter the measurement in inches you wish to convert");
    
        
        //user inups a number
        int con =input.nextInt();
        
        
        //
        double fin = con*2.54;
        System.out.println("Is " + fin + "inches");
        
    
    }
}
