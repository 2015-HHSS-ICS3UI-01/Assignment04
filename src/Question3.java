
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        Scanner input = new Scanner(System.in);
        //Store the numbers
        int number1;
        int number2;
        int number3;
        int number4;
        //Put 4 numbers down
        System.out.println("Please enter 4 numbers");
        //input 4 variables for your numbers
         number1 = input.nextInt();
         number2 = input.nextInt();
         number3 = input.nextInt();
         number4 = input.nextInt();
        //make the 4 numbers go all on 1 line
        System.out.println( "Your numbers were " + number1 + "," + number2 + "," + number3 + ", and " + number4);


        
        
    }
}
