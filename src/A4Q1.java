


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vickj2854
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // create a scanner for input
        Scanner input = new Scanner(System.in);

        // another version of it is: System.out.print("Please enter your name");
        // Get the users name
        System.out.println("Please enter your name");
        String name = input.nextLine();
        
        // say hello
        System.out.println("Hello" + name + ". How are you today");
        
        // finished
    }
}
