
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner for input
        Scanner input = new Scanner (System.in);
        
        //Get users name
        System.out.println("Please enter your name");
        String name = input.nextLine();
        
        //Say hello
        System.out.println("Hello " + name + ". How are you today?");
    }
}
