
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malcr1272
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner to read values
        Scanner in = new Scanner(System.in);
        
        //ask question
        System.out.println("What is your name?");
        String name = in.next();
        
        //Ask how they are
        System.out.println("Hello " + name  +". How are you today?");
        
        //end scanner
        in.close();
      
        
    }
}
