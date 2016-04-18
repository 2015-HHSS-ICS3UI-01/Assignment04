
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coulh9904
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Store user's name
        String Name;
        //Create the input scanner
   
        Scanner Input = new Scanner(System.in);
         //Get  user's name
        System.out.println("Please enter your name.");
        Name = Input.nextLine();
        System.out.println("*heavy breathing*");
        System.out.println("Hello " + Name);
        
    }
}
