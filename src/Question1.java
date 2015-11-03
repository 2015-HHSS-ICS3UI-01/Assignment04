
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

        //create scanner
        Scanner userInput = new Scanner(System.in);
        //request name from user
        System.out.println("Enter your name please.");
        //attach name inputed to variable 'name'
        String name = userInput.nextLine();

        System.out.println("Hello " + name + ". How are you?");

    }
}
