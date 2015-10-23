/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author mitrm7692
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a new Scanner
        Scanner input = new Scanner(System.in);
        
        // Make Scanner ask for name
        System.out.println("Please enter your name");
        
        // Type name into next line
        String name = input.nextLine();
        
        // Make Scanner say "hello" with users name
        System.out.println("Hello " + name);
    }
}
