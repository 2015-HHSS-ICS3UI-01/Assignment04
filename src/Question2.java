
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pintm1551
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;                                   //Store Name
        System.out.println("Please input a measurement in inches:");  //Asks to print name
        Scanner input = new Scanner(System.in);        //Create Scanner
        double a = input.nextInt();                       //Whatever is printed is saved as name
        double b = a * 2.54;
        System.out.println(a + " inches is " + b + " centimetres");
    }
}
