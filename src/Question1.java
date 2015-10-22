
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pircn0556
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        
        // Get the users name
        System.out.println("Please enter your name.");
        String name = input.nextLine();
        
        // Greet user
        System.out.println("Hello " +name+ ". How are you?" );
    }
}
