
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("What is your name:");
        Scanner nameS = new Scanner(System.in);
        String name= nameS.nextLine();
        System.out.println("Hello " + name + ".");
    }
}
