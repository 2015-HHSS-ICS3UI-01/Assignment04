
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agott2059
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner numberInput = new Scanner(System.in);
         
         System.out.println("Enter four numbers.");
        
         double numOne = numberInput.nextDouble();
         double numTwo = numberInput.nextDouble();
         double numThree = numberInput.nextDouble();
         double numFour = numberInput.nextDouble();
        
         System.out.println("Your four numbers are: " + numOne + ", " + numTwo + ", " + numThree + ", " + numFour + ".");
        
        
    }
}
