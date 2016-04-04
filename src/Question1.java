
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pintm1551
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;                                   //Store Name
        System.out.println("Please print your name:");  //Asks to print name
        Scanner input = new Scanner(System.in);        //Create Scanner
        name = input.nextLine();                       //Whatever is printed is saved as name
        System.out.println("Hello " + name);           //Prints Hello (name)
    }
}
