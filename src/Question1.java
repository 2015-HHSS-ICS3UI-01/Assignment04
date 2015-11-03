/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author prevw5940
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //Asks to input a name
        System.out.println("Please enter your name");
        //Adds space to type in the name, like William for example
        String name = input.nextLine();
        //makes the program say Hello William. How are you today?
        System.out.println("Hello " + name + ". How are you today?");
    }
}
