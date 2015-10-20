
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moore3607
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //created a new scanner called "input"
        Scanner input = new Scanner(System.in);
//makes the computer display the following on the screen
        System.out.println("Please enter your name");
        //puts the input from the user into a variable "name"
        String name = input.nextLine();
        //makes the computer display the following on the screen
        System.out.println("Hello " + name);
    }
}
