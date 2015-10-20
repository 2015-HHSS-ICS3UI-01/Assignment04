
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make scanner
        Scanner input = new Scanner (System.in);
        
        //tell user to enter four numbers
        System.out.println("Please enter four numbers on seperate lines");
        
        //read numbers from user
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int number4 = input.nextInt();
        
        //tell user numbers
        System.out.print("Your numbers were " );
        System.out.print(number1 + ",");
        System.out.print(number2 + ",");  
        System.out.print(number3 + ",");
        System.out.println("and " + number4);
        
        //close scanner
        input.close();
    }
}
