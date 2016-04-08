
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rahmf8586
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name:");
        name = input.nextLine();

        System.out.println("Hello " + name + ". How are you today?");

        input.close();
    }
}
