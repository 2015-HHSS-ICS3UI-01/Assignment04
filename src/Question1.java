
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author howen2217
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        // store users name
        Scanner input = new Scanner(System.in);
        // create scanner to get input
        System.out.println("Please enter your name:");
        // ask for users name
        name = input.nextLine();
        // save next input as users name
        System.out.println("Hello " + name + ". How are you today?");
        // greet user
    }
}
