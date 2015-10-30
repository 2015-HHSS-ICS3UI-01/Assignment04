
import java.util.Scanner;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alled7036
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        //Create Scanner
        Scanner input = new Scanner (System.in); 
        
        // Get Username
        System.out.println("Please Enter your name");
        String name = input.nextLine();
        
        // say Hello
        System.out.println("Hello " + name + ". How was your day?");
        
    }
}
