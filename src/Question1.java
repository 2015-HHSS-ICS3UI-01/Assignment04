/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author maxia2242
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner in = new Scanner(System.in);
        String name;
        
        System.out.println("Please enter your name");
        name =in.next();
        System.out.println( "Hello " + name + ". How are you today?");
        
    }
}
