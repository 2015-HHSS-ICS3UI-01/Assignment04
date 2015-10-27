
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lalim9800
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create new scannner 
        Scanner input = new Scanner(System.in);

        //tell the user to type in their name 
        System.out.println("Please enter the measuremnt in inches you wish to convert ");


        //creat a double to store inche amount 
        double inches = input.nextInt();

        // centimetrs will eqaul amount of inches multiplied by 2.54
        double centimeters = inches * 2.54;


        // let user know the amount of centimters 
        System.out.println("Centimeters= " + centimeters);
    }
}
