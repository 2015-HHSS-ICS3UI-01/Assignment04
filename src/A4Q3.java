
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String name;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter in 4 numbers on separate lines");
         Double A= input.nextDouble();
         Double B= input.nextDouble();
         Double C= input.nextDouble();
         Double D= input.nextDouble();
        
         System.out.println("Your numbers were " + A + "," + B + "," + C + "," + D);
    }
}
