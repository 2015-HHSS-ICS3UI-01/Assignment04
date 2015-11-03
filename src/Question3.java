
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prevw5940
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //inputs the 1st number you put in
        System.out.println("Please enter the first number");
        int number1 = input.nextInt();
        //inputs the 2nd number you put in
        System.out.println("Please enter the second number");
        int number2 = input.nextInt();
        //inputs the 3rd number you put in
        System.out.println("Please enter the third number");
        int number3 = input.nextInt();
        //inputs the 4th number you put in
        System.out.println("Please enter the last number");
        int number4 = input.nextInt();
        //inputs the 1st number you put in
        System.out.println(number1);
        //inputs the 2nd number you put in
        System.out.println(number2);
        //inputs the 3rd number you put in
        System.out.println(number3);
        //inputs the 4th number you put in
        System.out.println(number4);
        //says the numbers you imputed in order
        System.out.println("Your numbers were " + number1 + ", " + number2 + ", " + number3 + " and " + number4);
    }
}
