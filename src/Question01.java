
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iorgs3184
 */
public class Question01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //make a scanner
        Scanner input = new Scanner(System.in);
        
        //make string for words
        String userName;
        
        //user inputs words
        System.out.println("Please enter your name: ");
        userName = input.next();

        //print out hello and name of user
        System.out.println("Hello " + userName + "!");   
    }
}
