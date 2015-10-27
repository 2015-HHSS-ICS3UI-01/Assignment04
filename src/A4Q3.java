
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter 4 numbers. one on each line.");
        Scanner number = new Scanner(System.in);
        double num1 = number.nextDouble();
        double num2 = number.nextDouble();
        double num3 = number.nextDouble();
        double num4 = number.nextDouble();
        System.out.println("Your numbers were " + num1 + ", " + num2 + ", " + num3 + " and " + num4);
    }
}
