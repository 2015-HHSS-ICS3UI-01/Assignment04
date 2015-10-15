
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dawsr2694
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Greet user
        System.out.println("Hello. Please enter your name");

        //Create Scanner for input
        Scanner input = new Scanner(System.in);

        //Get users name
        String name = input.nextLine();

        //Say hello
        System.out.println("Hello, " + name + ". How are you today?");
    }
}
