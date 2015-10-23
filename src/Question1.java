/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author whitb0039
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in); 
        //make a new scanner
        
        System.out.println("Please enter your name"); 
        //ask user for their name
        
        String name = input.nextLine();
        //enter name into next line
        
        System.out.println("Hello, how are you " + name);
        //output "Hello, how are you(users name)"
           
    }
}
