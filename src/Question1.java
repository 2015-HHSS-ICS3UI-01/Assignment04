
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jon
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program using input output
        // first telling you to enter your name
        // and then answering with saying hello and how are you today?

        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        // get users name by asking them to type it in to collect the name
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        
        // respond with saying hellp then the name and then how are you today?
        System.out.println("Hello " + name + ". How are you today?");
        
        // close input scanner
        input.close();
    }
    
}
