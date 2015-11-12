
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eadil1765
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("What is your name?");
       Scanner input = new Scanner (System.in);
       String name = input.nextLine();
       System.out.println("Hello " + name);
    }
}
