
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author howen2217
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        // creates to scanner to input numbers
        System.out.println("Please input your 4 numbers on 4 different lines:");
        String number1 = input.nextLine();
        String number2 = input.nextLine();
        String number3 = input.nextLine();
        String number4 = input.nextLine();
        //store numbers
        System.out.println("Your numbers were " + number1 + ", " + number2 + ", " + number3 + " and " + number4);
        //output numbers
    }
}
