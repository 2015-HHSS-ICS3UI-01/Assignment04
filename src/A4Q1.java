
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kangh4484
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;
       Scanner input = new Scanner (System.in);
        System.out.println("Please enter your name: ");
        name = input.nextLine();
        System.out.println("Hello "+name+". How are you today?");
        
    }
}
