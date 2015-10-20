
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moore3607
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //created a new scanner called "input"
        Scanner input = new Scanner(System.in);
        //makes the computer display the following on the screen
        System.out.println("Please enter in 4 numbers on seperate lines");
        //puts the input from the user into a variable "number"
        double number = input.nextDouble();
        //puts the input from the user into a variable "numbe"
        double numbe = input.nextDouble();
        //puts the input from the user into a variable "numb"
        double numb = input.nextDouble();
        //puts the input from the user into a variable "num"
        double num = input.nextDouble();
        //makes the computer display the following on the screen
        System.out.println("Your numbers were " + number + "," + numbe + "," + numb + ", and " + num);




    }
}
