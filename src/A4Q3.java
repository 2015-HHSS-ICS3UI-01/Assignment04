
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kangh4484
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter in 4 numbers on separate lines");
        double first = input.nextDouble();
        double second = input.nextDouble();
        double third = input.nextDouble();
        double forth = input.nextDouble();
        System.out.println("Your numbers were " +first+","+second+","+third+", and "+forth);

    }
}
