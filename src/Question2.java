
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moore3607
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //created a new scanner called "input"  
        Scanner input = new Scanner(System.in);
        //makes the computer display the following on the screen
        System.out.println("Please enter the measurement in inches you wish to convert");
        //puts the input from the user into a variable "num"  
        Double num = input.nextDouble();
        //makes the computer display the following on the screen
        System.out.println(num + " inches is equal to " + 2.54 * num + " cm");


    }
}
