
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author farrb0382
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String numbers;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 4 different numbers on seperate lines.");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        System.out.println("Your numbers were " + a + " , " + b + " , " + c + " and " + d);

    }
}
