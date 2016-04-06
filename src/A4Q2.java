
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class A4Q2 {
    private static String inches;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String Name;
        
        // add a scanner
        Scanner input = new Scanner(System.in);
        
        // ask the user to input a number to convert
        System.out.println("Please insert a number in inches");
        Double inches = input.nextDouble();
        
        System.out.println(inches * 2.54);
    }
}
