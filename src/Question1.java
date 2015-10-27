
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hadik9595
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create a new Scanner to read in values
        Scanner in = new Scanner(System.in);

        // create a String to store a word for later
        String myString;

        // Read in a single word from the user
        System.out.println("Please enter your name");
        myString = in.next();

        // Outputs hello (name) how are you
        System.out.println("Hello " + myString + ". How are you today");

        // finishing with the Scanner
        in.close();
    }
}
