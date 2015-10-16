
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author watsk8668
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input scanner
        Scanner input = new Scanner(System.in);

        //Please enter in 4 numbers on separate lines
        System.out.println("Please enter in 4 numbers on separate lines:");
        String number1 = input.nextLine();
        String number2 = input.nextLine();
        String number3 = input.nextLine();
        String number4 = input.nextLine();

        System.out.println("Your numbers were " + number1 + ", " + number2 + ", " + number3 + ", and " + number4);

    }
}
