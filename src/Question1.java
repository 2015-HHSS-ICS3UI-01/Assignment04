
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your name");
        String name = input.nextLine();
        
        System.out.println("Hello " + name + ". How are you today? " );
    }
}
