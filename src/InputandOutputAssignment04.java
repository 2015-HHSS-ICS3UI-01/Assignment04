
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tatad6701
 */
public class InputandOutputAssignment04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Store the user's name
        String name;
        // Create the scanner to get input
        Scanner input = new Scanner(System.in);
        
        // Get the user's name
        System.out.println("Please enter your name");
        name = input.nextLine();
        
      // Greet the user  
      System.out.println("Hello " + name);
      
      // Determine their "age"
      System.out.println("What year were you born in?");
      int birthYear = input.nextInt();
      int age = 2016 - birthYear;
      
      // Tell the user how old they will be
        System.out.println("You will be " + age + " years old at the end of 2016");
      
      // Place all words on one line
      //System.out.print("Hello ");
      //System.out.print("Cat ");
      //System.out.println("World");
        
    }
}