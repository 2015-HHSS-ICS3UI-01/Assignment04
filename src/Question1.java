
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new Scanner to read in values
        Scanner in = new Scanner(System.in);

        // create a String to store a word for later
        String name;

        // The user enters their name
        System.out.println("Please enter your name");
        name = in.next();

        // Output our sentence to the user letting them know what they entered
        System.out.println("Hello " + name + ". How are you today? ");

        // finishing with the Scanner
        in.close();
        
    }
}
