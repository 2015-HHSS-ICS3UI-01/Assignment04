
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agott2059
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter your name please.");
        
        String name = userInput.nextLine();
        
        System.out.println("Hello " + name + ". How are you?");
        
    }
}
