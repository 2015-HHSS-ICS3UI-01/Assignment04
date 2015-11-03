
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        // These are to store numbers
        int first;
        int second;
        int third;
        int fourth;
        // Asks the humans for 4 numbers to type
        System.out.println("Please enter in 4 numbers on separate lines");
        first = in.nextInt();
        second = in.nextInt();
        third = in.nextInt();
        fourth = in.nextInt();
        // Outputs the unknown numbers the human wrote previously.
        System.out.println("Your numbers were " + first + "," + second + "," + third+ " and " + fourth + ".");
        
        in.close();
    }
}
