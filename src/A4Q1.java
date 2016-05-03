
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halll7908
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String name;

        Scanner input = new Scanner(System.in);
        
        System.out.println("What is your name?");

        name = input.nextLine();

        System.out.println("Hello "+ name +". How are you, today?");
        
    }
}
